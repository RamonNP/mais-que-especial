package com.game.inca.maisqueespecial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.game.inca.maisqueespecial.model.Jogo;
import com.game.inca.maisqueespecial.repository.JogadasRepository;
import com.game.inca.maisqueespecial.repository.JogoRepository;

@Controller
@CrossOrigin(origins = {"*"})
public class WebControllerGames {
	
	@Autowired
	private JogoRepository jogoRepository;
	
	@Autowired
	private JogadasRepository jogadasRepository;
	
	
	@RequestMapping(value = "/web/recuperarJogo/{id}", method = RequestMethod.GET, produces = { "application/json"})
	@ResponseBody 
	//@CrossOrigin(origins = "https://mais-que-especial-web.herokuapp.com")
	@CrossOrigin(origins = {"*"})
	public Jogo recuperarJogo(@PathVariable String id) {
		Jogo J = jogoRepository.findByNridjogo(Integer.parseInt(id));
		
		return J;
	}

	@RequestMapping(value = "/web/listaGames", method = RequestMethod.GET, produces = { "application/json"})
	@ResponseBody 
	//@CrossOrigin(origins = "https://mais-que-especial-web.herokuapp.com")
	@CrossOrigin(origins = {"*"})
	public List<Jogo> listaGames() {
		return jogoRepository.findAll();
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














