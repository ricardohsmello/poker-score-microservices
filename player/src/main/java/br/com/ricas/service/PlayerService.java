package br.com.ricas.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricas.entity.Player;
import br.com.ricas.repository.PlayerRepository;

@Service
public class PlayerService {
	
	private static final Logger LOG = LoggerFactory.getLogger(PlayerService.class);
	
	@Autowired 
	private PlayerRepository playerRepository;

	public Player save(Player entity) {	
		return playerRepository.save(entity);
	}
	
	public List<Player> findAll() {
		return (List<Player>) playerRepository.findAll();
	}

}
