package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the jogadas database table.
 * 
 */
@Entity
//@NamedQuery(name="jogada.findAll", query="SELECT j FROM JOGADAS J")
public class Jogadas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nridjogadas;

	@Column(name="nqTempoSegundos")
	private int tempo;
	
	@Column(name="nrQtdTentativas")
	private int tentativas;
	
	private Date dtInserida;
	
	//bi-directional many-to-one association to Aluno
	@ManyToOne
	@JoinColumn(name="NRIDJOGOALUNO")
	private Jogoaluno jogoAluno;

	public Jogadas() {
	}

	
	public Jogadas( int nridjogoaluno, int nqTempoSegundos, int nrQtdTentativas, Date dtInserida) {
		super();
//		this.nridjogoaluno = nridjogoaluno;
		this.tempo = nqTempoSegundos;
		this.tentativas = nrQtdTentativas;
		this.dtInserida = dtInserida;
	}


	public int getNridjogadas() {
		return this.nridjogadas;
	}

	public void setNridjogadas(int nridjogadas) {
		this.nridjogadas = nridjogadas;
	}


	

public int getTempo() {
		return tempo;
	}


	public void setTempo(int tempo) {
		this.tempo = tempo;
	}


	public int getTentativas() {
		return tentativas;
	}


	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}


	
	public static long getSerialversionuid() {
		return serialVersionUID;

	}


	public Date getDtInserida() {
		return dtInserida;
	}


	public void setDtInserida(Date dtInserida) {
		this.dtInserida = dtInserida;
	}


	public Jogoaluno getJogoAluno() {
		return jogoAluno;
	}


	public void setJogoAluno(Jogoaluno jogoAluno) {
		this.jogoAluno = jogoAluno;
	}

	
		

	
	
}