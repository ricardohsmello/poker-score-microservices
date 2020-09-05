package br.com.ricas.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDTO implements Serializable	 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String code;
	
	public PlayerDTO(String name, String code) { 
		this.name = name;
		this.code = code;
	}
}
