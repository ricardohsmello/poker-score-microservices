package br.com.ricas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricas.entity.Score;
import br.com.ricas.repository.ScoreRepository;

@Service
public class ScoreService {
	
	@Autowired
	private ScoreRepository scoreRepository;

	public Score save(Score entity) {
		return scoreRepository.save(entity);
	}

}
