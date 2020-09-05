package br.com.ricas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricas.entity.Score;

@Service
public class ScoreService {
	
	@Autowired
	private RabbitMQSender rabbitMQSender;
	
	public String send(Score entity) {
		return rabbitMQSender.send(entity);
	}
	
}
