package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the jogo database table.
 * 
 */
@Entity
@NamedQuery(name="Jogo.findAll", query="SELECT j FROM Jogo j")
public class Jogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nridjogo;

	private String descnome;

	private String descurl;
	
	private String descImg;
	
	private String descDetalhe;

	private int nriddiciplina;

	//bi-directional many-to-one association to Jogoaluno
//	@OneToMany(mappedBy="jogo", fetch = FetchType.EAGER)
//	private List<Jogoaluno> jogoalunos;

	
	public String getDescDetalhe() {
		return descDetalhe;
	}


	public void setDescDetalhe(String descDetalhe) {
		this.descDetalhe = descDetalhe;
	}


	public Jogo() {
	}

	
	public String getDescImg() {
		return descImg;
	}


	public void setDescImg(String descImg) {
		this.descImg = descImg;
	}


	public int getNridjogo() {
		return this.nridjogo;
	}

	public void setNridjogo(int nridjogo) {
		this.nridjogo = nridjogo;
	}

	public String getDescnome() {
		return this.descnome;
	}

	public void setDescnome(String descnome) {
		this.descnome = descnome;
	}

	public String getDescurl() {
		return this.descurl;
	}

	public void setDescurl(String descurl) {
		this.descurl = descurl;
	}

	public int getNriddiciplina() {
		return this.nriddiciplina;
	}

	public void setNriddiciplina(int nriddiciplina) {
		this.nriddiciplina = nriddiciplina;
	}

//	public List<Jogoaluno> getJogoalunos() {
//		return this.jogoalunos;
//	}
//
//	public void setJogoalunos(List<Jogoaluno> jogoalunos) {
//		this.jogoalunos = jogoalunos;
//	}

//	public Jogoaluno addJogoaluno(Jogoaluno jogoaluno) {
//		getJogoalunos().add(jogoaluno);
//		jogoaluno.setJogo(this);
//
//		return jogoaluno;
//	}
//
//	public Jogoaluno removeJogoaluno(Jogoaluno jogoaluno) {
//		getJogoalunos().remove(jogoaluno);
//		jogoaluno.setJogo(null);
//
//		return jogoaluno;
//	}

}