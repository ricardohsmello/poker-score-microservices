package br.com.ricas;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.ricas.model.Score;
import br.com.ricas.resource.dto.ScoreDTO;
import br.com.ricas.service.RabbitMQSender;
import br.com.ricas.service.ScoreService;
 
@RunWith(MockitoJUnitRunner.class)
public class ScoreServiceTests {
	
	@InjectMocks
	private ScoreService scoreService;
	
	@Mock
	private RabbitMQSender rabbitMQSender;
	
	@Test
	public void createPlayer() {
		ScoreDTO scoreDTO = new ScoreDTO();
		scoreDTO.setValue(5);
		scoreDTO.setPlayerCode("cod201");
		
		Score score = scoreDTO.transformToObject();
		scoreService.send(score);
		
		verify(rabbitMQSender, times(1)).send(score);
	}
}