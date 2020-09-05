package br.com.ricas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ricas.entity.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
 