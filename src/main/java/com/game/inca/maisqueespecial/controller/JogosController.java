package com.game.inca.maisqueespecial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.game.inca.maisqueespecial.model.Jogo;
import com.game.inca.maisqueespecial.repository.JogoRepository;

@Controller
//@CrossOrigin(origins = {"https://maisqueespecialgames.herokuapp.com"})
public class JogosController {
	
	@Autowired
	private JogoRepository jogoRepository;

	@RequestMapping(value = "/listaGamesPorUsuario/{login}", method = RequestMethod.OPTIONS, produces = { "application/json"})
	@ResponseBody 
	//@CrossOrigin(origins = "https://mais-que-especial-web.herokuapp.com")
	@CrossOrigin(origins = {"*"})
	public String listaGames(@PathVariable String login) {
		ArrayList<Jogo> list = jogoRepository.findByLogin(login);
		return montarArrayJogos(list);
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
	
	
	
	
}














