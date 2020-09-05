package br.com.ricas.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.ricas.api.dto.PlayerDTO;
import br.com.ricas.entity.Player;
import br.com.ricas.repository.PlayerRepository;
import br.com.ricas.service.PlayerService;

@RunWith(MockitoJUnitRunner.class)
public class PlayerControllerTests {
	
	@InjectMocks
	private PlayerService playerService;
	
	@Mock
	private PlayerRepository playerRepository;
	
	@Test
	public void createPlayer() {
		PlayerDTO playerDto = new PlayerDTO("Ricardo", "Cod001");
		Player player = playerDto.transformToObject();
		playerService.save(player);
		
		verify(playerRepository, times(1)).save(player);
	}
	
	@Test
	public void getAllPlayers() {
		List<Player> list = new ArrayList<>();

		PlayerDTO ricardo = new PlayerDTO("Ricardo", "Cod001");
		PlayerDTO henrique = new PlayerDTO("Henrique", "Cod002");

		list.add(ricardo.transformToObject());
		list.add(henrique.transformToObject());

		when(playerRepository.findAll()).thenReturn(list);

		List<Player> empList = playerService.findAll();
		assertEquals(2, empList.size());

		verify(playerRepository, times(1)).findAll();
	}
}

