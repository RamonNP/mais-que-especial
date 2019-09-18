package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the aluno database table.
 * 
 */

@Entity
@NamedQuery(name="Aluno.findAll", query="SELECT a FROM Aluno a")
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nridaluno;

	private int nridacesso;

	@OneToOne
	@JoinColumn(name="nriddetalhescadastro")
	private Detalhescadastro detalhescadastro;

	private int nridendereco;

	private int nridprofessortutor;

	//bi-directional many-to-one association to Jogoaluno
	@OneToMany(mappedBy="aluno")
	private List<Jogoaluno> jogoalunos;

	public Aluno() {
	}

	public int getNridaluno() {
		return this.nridaluno;
	}

	public void setNridaluno(int nridaluno) {
		this.nridaluno = nridaluno;
	}

	public int getNridacesso() {
		return this.nridacesso;
	}

	public void setNridacesso(int nridacesso) {
		this.nridacesso = nridacesso;
	}

	

	public Detalhescadastro getDetalhescadastro() {
		return detalhescadastro;
	}

	public void setDetalhescadastro(Detalhescadastro detalhescadastro) {
		this.detalhescadastro = detalhescadastro;
	}

	public int getNridendereco() {
		return this.nridendereco;
	}

	public void setNridendereco(int nridendereco) {
		this.nridendereco = nridendereco;
	}

	public int getNridprofessortutor() {
		return this.nridprofessortutor;
	}

	public void setNridprofessortutor(int nridprofessortutor) {
		this.nridprofessortutor = nridprofessortutor;
	}

	public List<Jogoaluno> getJogoalunos() {
		return this.jogoalunos;
	}

	public void setJogoalunos(List<Jogoaluno> jogoalunos) {
		this.jogoalunos = jogoalunos;
	}

	public Jogoaluno addJogoaluno(Jogoaluno jogoaluno) {
		getJogoalunos().add(jogoaluno);
		jogoaluno.setAluno(this);

		return jogoaluno;
	}

	public Jogoaluno removeJogoaluno(Jogoaluno jogoaluno) {
		getJogoalunos().remove(jogoaluno);
		jogoaluno.setAluno(null);

		return jogoaluno;
	}

}