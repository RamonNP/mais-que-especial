package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the instituicao database table.
 * 
 */
@Entity
@NamedQuery(name="Instituicao.findAll", query="SELECT i FROM Instituicao i")
public class Instituicao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="NRIDINSTITUICAO")
	private Integer nrIdInstituicao;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "NRIDACESSO", nullable = false)
	private Acesso acesso;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "NRIDDETALHESCADASTRO", nullable = false)
	private Detalhescadastro detalheCadastro;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "NRIDENDERECO", nullable = false)
	private Endereco endereco;

	public Instituicao() {
	}


	public Integer getNrIdInstituicao() {
		return nrIdInstituicao;
	}


	public void setNrIdInstituicao(int nrIdInstituicao) {
		this.nrIdInstituicao = nrIdInstituicao;
	}


	public Acesso getAcesso() {
		return acesso;
	}


	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}


	public Detalhescadastro getDetalheCadastro() {
		return detalheCadastro;
	}


	public void setDetalheCadastro(Detalhescadastro detalheCadastro) {
		this.detalheCadastro = detalheCadastro;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}