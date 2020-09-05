package br.com.ricas.api.dto;

import br.com.ricas.entity.Player;

public class PlayerDTO {

	private String name;
	private String code;
	
	public PlayerDTO(String name, String code) { 
		this.name = name;
		this.code = code;
	}
	
	public Player transformToObject(){
	    return new Player(name, code);
	}
}
