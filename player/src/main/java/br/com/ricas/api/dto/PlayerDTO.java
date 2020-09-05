package br.com.ricas.api.dto;

import br.com.ricas.entity.Player;

public class PlayerDTO {

	private String name;
	private int point;
	
	public PlayerDTO(String name, int point) { 
		this.name = name;
		this.point = point;
	}
	
	public Player transformToObject(){
	    return new Player(name, point);
	}
}
