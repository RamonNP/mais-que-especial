package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detalhescadastro database table.
 * 
 */
@Entity
@NamedQuery(name="Detalhescadastro.findAll", query="SELECT d FROM Detalhescadastro d")
public class Detalhescadastro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="NRIDDETALHESCADASTRO")
	private Integer nrIddetalhesCadastro;

	
	@Column(name="CODSEXO")
	private int codSexo;

	@Column(name="DESCCPFCNPJ")
	private String descCpfCnpj;

	@Column(name="DESCNOME")
	private String descNome;

	@Column(name="DESCSOBRENOME")
	private String descSobrenome;

	@Column(name="DTNASCIMENTO")
	private String dtNascimento;

	@Column(name="NRCELULAR")
	private String nrCelular;

	@Column(name="NRTELEFONE")
	private String nrTelefone;

	public Detalhescadastro() {
	}

	public int getNrIddetalhesCadastro() {
		return nrIddetalhesCadastro;
	}

	public void setNrIddetalhesCadastro(int nrIddetalhesCadastro) {
		this.nrIddetalhesCadastro = nrIddetalhesCadastro;
	}

	public int getCodSexo() {
		return codSexo;
	}

	public void setCodSexo(int codSexo) {
		this.codSexo = codSexo;
	}

	public String getDescCpfCnpj() {
		return descCpfCnpj;
	}

	public void setDescCpfCnpj(String descCpfCnpj) {
		this.descCpfCnpj = descCpfCnpj;
	}

	public String getDescNome() {
		return descNome;
	}

	public void setDescNome(String descNome) {
		this.descNome = descNome;
	}

	public String getDescSobrenome() {
		return descSobrenome;
	}

	public void setDescSobrenome(String descSobrenome) {
		this.descSobrenome = descSobrenome;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getNrCelular() {
		return nrCelular;
	}

	public void setNrCelular(String nrCelular) {
		this.nrCelular = nrCelular;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	
	
}