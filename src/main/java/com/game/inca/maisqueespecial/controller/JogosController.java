package com.game.inca.maisqueespecial.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.game.inca.maisqueespecial.model.Jogada;
import com.game.inca.maisqueespecial.model.Jogo;
import com.game.inca.maisqueespecial.repository.JogadasRepository;
import com.game.inca.maisqueespecial.repository.JogoRepository;
import com.game.inca.maisqueespecial.request.JogadasRequest;

@Controller
//@CrossOrigin(origins = {"https://maisqueespecialgames.herokuapp.com"})
public class JogosController {
	
	@Autowired
	private JogoRepository jogoRepository;
	
	@Autowired
	private JogadasRepository jogadasRepository;
	
	@RequestMapping(value = "/addJogadas", method = RequestMethod.POST, produces = { "application/json"})
	@ResponseBody 
	//@CrossOrigin(origins = "https://mais-que-especial-web.herokuapp.com")
	@CrossOrigin(origins = {"*"})
	public String addJogadas(@RequestBody JogadasRequest jogada) {
		int idJogoALuno = 0;
		try {
			idJogoALuno = jogoRepository.findAlunoByLogin(jogada.getLogin(), jogada.getJogo());
			//public Jogada( int nridjogoaluno, int nqTempoSegundos, int nrQtdTentativas, Date dtInserida) {
			Jogada j = new Jogada(idJogoALuno, jogada.getTempo(), jogada.getTentativas(), new Date() );
			jogadasRepository.save(j);
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
		return "1";
		
	}

	@RequestMapping(value = "/listaGamesPorUsuario/{login}", method = RequestMethod.GET, produces = { "application/json"})
	@ResponseBody 
	//@CrossOrigin(origins = "https://mais-que-especial-web.herokuapp.com")
	@CrossOrigin(origins = {"*"})
	public String listaGames(@PathVariable String login) {
		ArrayList<Jogo> c = jogoRepository.findByLogin(login);
		if(c.isEmpty()) {
			return "0";
		}
		return montarArrayJogos(c);
	}

	public String montarArrayJogos(List<Jogo> jogos) {

		String retorno = "{\"c2array\":true,\"size\":[" + jogos.size() + ",2,1]," + "\"data\":[[";
		for (Jogo jogo : jogos) {
			retorno += "[\"" + jogo.getDescnome() + "\"],[\"" + jogo.getNridjogo() + "\"]],[";
		}
		retorno = retorno.substring(0, retorno.length()-3);
		retorno += "]]}";
		return retorno;
	}


	public JogoRepository getJogoRepository() {
		return jogoRepository;
	}



	public void setJogoRepository(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}

	public JogadasRepository getJogadasRepository() {
		return jogadasRepository;
	}

	public void setJogadasRepository(JogadasRepository jogadasRepository) {
		this.jogadasRepository = jogadasRepository;
	}

	
	
	
}














