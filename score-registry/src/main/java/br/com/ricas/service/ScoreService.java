package br.com.ricas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricas.entity.Score;
import br.com.ricas.repository.ScoreRepository;

@Service
public class ScoreService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ScoreService.class);

	@Autowired
	private ScoreRepository repository;

	public Score save(Score score) {
		Score sv = repository.save(score);
		LOG.info("Score id: " + sv.getId() + " was created with sucessful");
		return sv;
	}
}
