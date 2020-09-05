package br.com.ricas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ricas.entity.Score;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Long>{
}
