package br.com.ricas.model;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.ricas.entity.Player;

public class PlayerTests {

	private static Player p;

	@BeforeClass
	public static void init() {
		p = new Player();
	}
	
	@Test 
	public void shouldCreatePlayer() {
		assertNotNull(p);
	}
	
	@Test
	public void shouldCreateACodeForPlayer() {
		p.setCode("Cod001");
		assertNotNull(p.getCode());
	}
	
	@Test
	public void shouldCreateANameForPlayer() {
		p.setName("Ricardo");
		assertNotNull(p.getName());
	}
}

