package br.com.ricas.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.ricas.entity.Score;

@Service
public class RabbitMQSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	@Value("${score.rabbitmq.exchange}")
	private String exchange;

	@Value("${score.rabbitmq.routingkey}")
	private String routingkey;

	public String send(Score score) {
		rabbitTemplate.convertAndSend(exchange, routingkey, score);
		return "Score of playerID = " + score.getPlayerID() + " was sent to queue to persist..";
	}

}
