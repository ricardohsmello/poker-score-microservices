package br.com.ricas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ricas.dto.ScoreDTO;

@FeignClient("score-registry")
public interface ScoreClient {

	@RequestMapping(method=RequestMethod.POST, value="/api/score/")
	ScoreDTO save(ScoreDTO score);
}
