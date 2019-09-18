package com.game.inca.maisqueespecial.response;

import java.io.Serializable;
import java.util.ArrayList;

public class JogadasResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String nome;
	private String jogo;
	ArrayList<JogadasDetalheResponse> jogadas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getJogo() {
		return jogo;
	}
	public void setJogo(String jogo) {
		this.jogo = jogo;
	}
	public ArrayList<JogadasDetalheResponse> getJogadas() {
		return jogadas;
	}
	public void setJogadas(ArrayList<JogadasDetalheResponse> jogadas) {
		this.jogadas = jogadas;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
