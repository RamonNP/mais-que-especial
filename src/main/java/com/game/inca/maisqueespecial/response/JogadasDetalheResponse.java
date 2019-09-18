package com.game.inca.maisqueespecial.response;

import java.io.Serializable;

public class JogadasDetalheResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int tempo;
	
	private int tentativas;
	
	private String DataCriado;

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

	public String getDataCriado() {
		return DataCriado;
	}

	public void setDataCriado(String dataCriado) {
		DataCriado = dataCriado;
	}
	
	
	
}
