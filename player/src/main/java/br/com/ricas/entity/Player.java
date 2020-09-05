package br.com.ricas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter
@Setter
public class Player {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String code;
	
	public Player(String name, String code) {
		this.name = name;
		this.code = code;
	} 
	
	public Player() {}
}
