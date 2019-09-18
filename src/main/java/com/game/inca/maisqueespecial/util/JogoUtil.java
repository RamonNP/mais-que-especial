package com.game.inca.maisqueespecial.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.game.inca.maisqueespecial.model.Aluno;
import com.game.inca.maisqueespecial.model.Jogadas;
import com.game.inca.maisqueespecial.model.Jogoaluno;
import com.game.inca.maisqueespecial.response.JogadasDetalheResponse;
import com.game.inca.maisqueespecial.response.JogadasResponse;

public class JogoUtil {
	
	
	public static List<JogadasResponse> responseJogadas(Aluno aluno){
		List<JogadasResponse> response = new ArrayList<JogadasResponse>();
		JogadasResponse jogadasResponse;
		for (Jogoaluno jogoaluno : aluno.getJogoalunos()) {
			jogadasResponse = new JogadasResponse();
			jogadasResponse.setId(jogoaluno.getNridjogoaluno());
			jogadasResponse.setNome(jogoaluno.getJogo().getDescnome());
			jogadasResponse.setJogo(jogoaluno.getJogo().getDescDetalhe());//jogoaluno.get
			jogadasResponse.setJogadas(converterJogadasParaJogadasDetalheResponse(jogoaluno.getJogadas()));
			response.add(jogadasResponse);
		}
		
		return response;
	}
	
	
	public static ArrayList<JogadasDetalheResponse> converterJogadasParaJogadasDetalheResponse(List<Jogadas> list) {
		ArrayList<JogadasDetalheResponse> listDetalhe = new ArrayList<JogadasDetalheResponse>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		JogadasDetalheResponse jogadasDetalheResponse;
		for (Jogadas jogada : list) {
			jogadasDetalheResponse = new JogadasDetalheResponse();
			jogadasDetalheResponse.setTempo(jogada.getTempo());
			jogadasDetalheResponse.setTentativas(jogada.getTentativas());
			jogadasDetalheResponse.setDataCriado(sdf.format(jogada.getDtInserida()));
			listDetalhe.add(jogadasDetalheResponse);
		}
		return listDetalhe;
	}

}
