package com.game.inca.maisqueespecial.request;

import java.io.Serializable;

public class JogadasRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private int jogo;
	private int nrIdAluno;
	private int tempo;
	private int tentativas;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getJogo() {
		return jogo;
	}

	public void setJogo(int jogo) {
		this.jogo = jogo;
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

	public int getNrIdAluno() {
		return nrIdAluno;
	}

	public void setNrIdAluno(int nrIdAluno) {
		this.nrIdAluno = nrIdAluno;
	}

	
}
