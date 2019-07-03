package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the endereco database table.
 * 
 */
@Entity
@NamedQuery(name="Endereco.findAll", query="SELECT e FROM Endereco e")
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="NRIDENDERECO")
	private Integer nrIdEndereco;

	@Column(name="CDCEP")
	private String cdCep;

	@Column(name="DESCBAIRRO")
	private String descBairro;

	@Column(name="DESCCIDADE")
	private String descCidade;

	@Column(name="DESCCOMPLEMENTO")
	private String descComplemento;

	@Column(name="DESCESTADO")
	private String descEstado;

	@Column(name="DESCNUMERO")
	private String descNumero;

	@Column(name="DESCPAIS")
	private String descPais = "BR";

	@Column(name="DESCRUA")
	private String descRua;

	
	public Endereco(String descRua) {
		super();
		this.descRua = descRua;
	}

	public Endereco() {
	}

	public int getNrIdEndereco() {
		return nrIdEndereco;
	}

	public void setNrIdEndereco(int nrIdEndereco) {
		this.nrIdEndereco = nrIdEndereco;
	}

	public String getCdCep() {
		return cdCep;
	}

	public void setCdCep(String cdCep) {
		this.cdCep = cdCep;
	}
	

	public String getDescBairro() {
		return descBairro;
	}

	public void setDescBairro(String descBairro) {
		this.descBairro = descBairro;
	}

	public String getDescCidade() {
		return descCidade;
	}

	public void setDescCidade(String descCidade) {
		this.descCidade = descCidade;
	}

	public String getDescComplemento() {
		return descComplemento;
	}

	public void setDescComplemento(String descComplemento) {
		this.descComplemento = descComplemento;
	}

	public String getDescEstado() {
		return descEstado;
	}

	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

	public String getDescNumero() {
		return descNumero;
	}

	public void setDescNumero(String descNumero) {
		this.descNumero = descNumero;
	}

	public String getDescPais() {
		return descPais;
	}

	public void setDescPais(String descPais) {
		this.descPais = descPais;
	}

	public String getDescRua() {
		return descRua;
	}

	public void setDescRua(String descRua) {
		this.descRua = descRua;
	}

	

}