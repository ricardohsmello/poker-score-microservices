package br.com.ricas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricas.entity.Score;
import br.com.ricas.repository.ScoreRepository;

@Service
public class ScoreService {
	
	@Autowired
	private ScoreRepository repository;

	public Score save(Score score) {
		return repository.save(score);
	}
}
