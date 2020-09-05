package br.com.ricas;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.ricas.model.Score;

public class ScoreTests {
	
	private static Score score;

	@Test
	public void shouldCreateScore() {
		assertNotNull(score);
	}
	
	@BeforeAll
	public static void init() {
		score = new Score();
	}
	
	@Test
	public void shouldCreateValuePositive() {
		score.setValue(5);
		assertTrue(score.getValue() > 0);
	}
	
	@Test
	public void scoreShouldHaveAPlayerID() {
		score.setPlayerCode("cod201");
		assertNotNull(score.getPlayerCode());
	}

}
