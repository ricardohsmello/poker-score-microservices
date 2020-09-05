package br.com.ricas.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Score implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int value;
	private String playerCode;
	
	public Score(int value, String playerCode) {
		this.value = value;
		this.playerCode = playerCode;
	}
	
	public Score() {
	}
}
