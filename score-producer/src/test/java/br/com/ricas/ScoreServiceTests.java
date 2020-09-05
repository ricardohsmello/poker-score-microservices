package br.com.ricas;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.ricas.entity.Score;
import br.com.ricas.repository.ScoreRepository;
import br.com.ricas.resource.dto.ScoreDTO;
import br.com.ricas.service.ScoreService;
 
@RunWith(MockitoJUnitRunner.class)
public class ScoreServiceTests {
	
	@InjectMocks
	private ScoreService scoreService;
	
	@Mock
	private ScoreRepository ScoreRepository;
	
	@Test
	public void createPlayer() {
		ScoreDTO scoreDTO = new ScoreDTO();
		scoreDTO.setValue(5);
		scoreDTO.setPlayerID(1L);
		
		Score score = scoreDTO.transformToObject();
		scoreService.save(score);
		
		verify(ScoreRepository, times(1)).save(score);
	}
}