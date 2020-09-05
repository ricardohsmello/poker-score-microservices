package br.com.ricas.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class ScoreMQListener implements MessageListener {

	public void onMessage(Message message) {
		System.out.println("Consuming Message - " + new String(message.getBody()));
	}

}