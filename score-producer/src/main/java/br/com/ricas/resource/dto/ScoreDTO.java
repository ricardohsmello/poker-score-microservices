package br.com.ricas.resource.dto;

import br.com.ricas.model.Score;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ScoreDTO {

	private int value;
	private String playerCode;
	
	public Score transformToObject() {
		return new Score(value, playerCode);
	}
} 
