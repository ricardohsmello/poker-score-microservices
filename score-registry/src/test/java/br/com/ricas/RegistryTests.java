package br.com.ricas;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.ricas.entity.Score;

public class RegistryTests {

	@Test
	public void pointMustBeGreatherThanZero() {
		Score score = new Score();
		score.setValue(1);
		assertTrue(score.getValue() > 0);
	}

	@Test
	public void shouldHaveAPlayer() {
		Score score = new Score();
		score.setPlayerName("Ricardo");
		assertNotNull(score.getPlayerName());
	}
}
