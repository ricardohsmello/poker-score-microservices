package br.com.ricas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ricas.dto.PlayerDTO;

@FeignClient("player")
public interface PlayerClient {

	@RequestMapping("/api/player/{playerCode}")
	PlayerDTO findByCode(@PathVariable String playerCode);
}
