package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the jogadas database table.
 * 
 */
@Entity
@Table(name="jogadas")
@NamedQuery(name="Jogada.findAll", query="SELECT j FROM Jogada j")
public class Jogada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nridjogadas;

	private int nridjogoaluno;

	public Jogada() {
	}

	public int getNridjogadas() {
		return this.nridjogadas;
	}

	public void setNridjogadas(int nridjogadas) {
		this.nridjogadas = nridjogadas;
	}

	public int getNridjogoaluno() {
		return this.nridjogoaluno;
	}

	public void setNridjogoaluno(int nridjogoaluno) {
		this.nridjogoaluno = nridjogoaluno;
	}

}