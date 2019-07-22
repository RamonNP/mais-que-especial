package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


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
	
	private int nqTempoSegundos;
	
	private int nrQtdTentativas;
	
	private Date dtInserida;

	public Jogada() {
	}

	
	public Jogada( int nridjogoaluno, int nqTempoSegundos, int nrQtdTentativas, Date dtInserida) {
		super();
		this.nridjogoaluno = nridjogoaluno;
		this.nqTempoSegundos = nqTempoSegundos;
		this.nrQtdTentativas = nrQtdTentativas;
		this.dtInserida = dtInserida;
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

	public int getNqTempoSegundos() {
		return nqTempoSegundos;
	}

	public void setNqTempoSegundos(int nqTempoSegundos) {
		this.nqTempoSegundos = nqTempoSegundos;
	}

	public int getNrQtdTentativas() {
		return nrQtdTentativas;
	}

	public void setNrQtdTentativas(int nrQtdTentativas) {
		this.nrQtdTentativas = nrQtdTentativas;
	}

	public Date getDtInserida() {
		return dtInserida;
	}

	public void setDtInserida(Date dtInserida) {
		this.dtInserida = dtInserida;
	}

	
	
}