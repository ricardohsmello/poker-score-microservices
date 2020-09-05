package br.com.ricas.resource.dto;

import br.com.ricas.entity.Score;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ScoreDTO {

	private int value;
	private Long playerID;
	
	public Score transformToObject() {
		return new Score(value, playerID);
	}
} 
