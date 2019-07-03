package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the jogoaluno database table.
 * 
 */
@Entity
@NamedQuery(name="Jogoaluno.findAll", query="SELECT j FROM Jogoaluno j")
public class Jogoaluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nridjogoaluno;

	//bi-directional many-to-one association to Jogo
	@ManyToOne
	@JoinColumn(name="NRIDJOGO")
	private Jogo jogo;

	//bi-directional many-to-one association to Aluno
	@ManyToOne
	@JoinColumn(name="NRIDALUNO")
	private Aluno aluno;

	public Jogoaluno() {
	}

	public int getNridjogoaluno() {
		return this.nridjogoaluno;
	}

	public void setNridjogoaluno(int nridjogoaluno) {
		this.nridjogoaluno = nridjogoaluno;
	}

	public Jogo getJogo() {
		return this.jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public Aluno getAluno() {
		return this.aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}