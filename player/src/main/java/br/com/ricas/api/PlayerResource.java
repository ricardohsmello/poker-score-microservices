package br.com.ricas.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ricas.api.dto.PlayerDTO;
import br.com.ricas.entity.Player;
import br.com.ricas.service.PlayerService;

@RestController
@RequestMapping("api/player")
public class PlayerResource {

	@Autowired
	private PlayerService playerService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Player> createPlayer(@RequestBody PlayerDTO playerDTO) {
	    Player player = playerService.save(playerDTO.transformToObject()); 
	    return new ResponseEntity<>(player, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public ResponseEntity<Player> findByCode(@PathVariable("code") String code) {
	    Player player = playerService.findByCode(code); 
	    return new ResponseEntity<>(player, HttpStatus.OK);
	}
}
