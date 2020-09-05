package br.com.ricas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ricas.client.PlayerClient;
import br.com.ricas.client.ScoreClient;
import br.com.ricas.dto.PlayerDTO;
import br.com.ricas.dto.ScoreDTO;

@Service
public class ScoreMQListener implements MessageListener {

	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private PlayerClient playerClient;
	
	@Autowired
	private ScoreClient scoreClient;
	
	private static final Logger LOG = LoggerFactory.getLogger(ScoreMQListener.class);

	public void onMessage(Message message) {
		String messageBody = new String(message.getBody());
		LOG.info("Consuming Message - " + messageBody);

		try {
			ScoreDTO scoreDTO = objectMapper.readValue(messageBody, ScoreDTO.class);
			
			//Accessing Player Microservice to find the name of player
			PlayerDTO player = playerClient.findByCode(scoreDTO.getPlayerCode());
			scoreDTO.setPlayerName(player.getName());
			
			//Accessing Score Microservice to persist the score
			scoreClient.save(scoreDTO);
			
			LOG.info("Score of the player " +scoreDTO.getPlayerName() + " was persisted with " + scoreDTO.getValue() + " points");
			
		} catch (Exception ex) {
			LOG.error(ex.getMessage());
			throw new RuntimeException(ex);
		}
	}

}