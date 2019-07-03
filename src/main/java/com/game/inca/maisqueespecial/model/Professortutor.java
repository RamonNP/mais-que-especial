package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the professortutor database table.
 * 
 */
@Entity
@NamedQuery(name="Professortutor.findAll", query="SELECT p FROM Professortutor p")
public class Professortutor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nridprofessortutor;

	private String descnome;

	private int nridacesso;

	private int nridendereco;

	private int nridinstituicao;

	public Professortutor() {
	}

	public int getNridprofessortutor() {
		return this.nridprofessortutor;
	}

	public void setNridprofessortutor(int nridprofessortutor) {
		this.nridprofessortutor = nridprofessortutor;
	}

	public String getDescnome() {
		return this.descnome;
	}

	public void setDescnome(String descnome) {
		this.descnome = descnome;
	}

	public int getNridacesso() {
		return this.nridacesso;
	}

	public void setNridacesso(int nridacesso) {
		this.nridacesso = nridacesso;
	}

	public int getNridendereco() {
		return this.nridendereco;
	}

	public void setNridendereco(int nridendereco) {
		this.nridendereco = nridendereco;
	}

	public int getNridinstituicao() {
		return this.nridinstituicao;
	}

	public void setNridinstituicao(int nridinstituicao) {
		this.nridinstituicao = nridinstituicao;
	}

}