package br.com.ricas.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ricas.entity.Score;
import br.com.ricas.resource.dto.ScoreDTO;
import br.com.ricas.service.ScoreService;

@RestController
@RequestMapping("api/score")
public class ScoreResource {

	@Autowired
	private ScoreService scoreService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> save(@RequestBody ScoreDTO scoreDTO) {
		Score score = scoreService.save(scoreDTO.transformToObject());
		return new ResponseEntity<>("Score " + score.getId() + ", of playerID =  "+ scoreDTO.getPlayerID() + " was sent to persist..", HttpStatus.CREATED);
	}
}
