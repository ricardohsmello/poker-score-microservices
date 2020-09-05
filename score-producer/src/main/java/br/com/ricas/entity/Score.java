package br.com.ricas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Score {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int value;
	private Long playerID;
	
	public Score(int value, Long playerID) {
		this.value = value;
		this.playerID = playerID;
	}
	
	public Score() {
	}
}
