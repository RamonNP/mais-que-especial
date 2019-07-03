package com.game.inca.maisqueespecial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.game.inca.maisqueespecial.model.Endereco;
import com.game.inca.maisqueespecial.model.Instituicao;
import com.game.inca.maisqueespecial.model.Jogo;
import com.game.inca.maisqueespecial.repository.InstituicaoRepository;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class InstituicaoController {
	
	@Autowired
	private InstituicaoRepository instituicaoRepository;
	private Instituicao instituicao;
	
	
	@RequestMapping(value = "/listaGames", method = RequestMethod.GET, produces = { "application/json"})
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Jogo> listaGames() {
		ArrayList<Jogo> list = new ArrayList<Jogo>();
		Jogo j1 = new Jogo();
		j1.setDescnome("Jogo da cozinha");
		j1.setDescDetalhe("Este Jogo Treina a escolhe sobre os objetos da cozinha");
		j1.setDescImg("https://i.ibb.co/9VVLSMy/jogo-espa-o.png");
		j1.setDescurl("http://politica-ramon.000webhostapp.com/ArthurGames/cozinha/");
		Jogo j2 = new Jogo();
		j2.setDescnome("Jogo do espa");
		j2.setDescDetalhe("Este Jogo Treina a escolhe sobre todos itens da astrologia");
		j2.setDescImg("https://i.ibb.co/r0MVB70/Capturar.png");
		list.add(j1);
		list.add(j2);
		list.add(j2);
		list.add(j1);
		list.add(j2);
		list.add(j1);
		list.add(j1);
		list.add(j2);
		list.add(j2);
		list.add(j1);
		list.add(j2);
		list.add(j1);
		return list;

	}
	
//	@RequestMapping("/users")
//	@ResponseBody
//	public String getUsers() {
//		return "{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," +
//		           "{\"name\":\"Jackie\",\"country\":\"China\"}]}";
//	}
	
	@RequestMapping("/especia/instituicoes")
	public ModelAndView listar() {
		
		List<Instituicao> todasInstituicoes = instituicaoRepository.findAll();
		
		ModelAndView mv = new ModelAndView("ListaInstituicao");
		
		mv.addObject("instituicoes", todasInstituicoes);
		
		mv.addObject(new Instituicao());
		
		return mv;
	}

	@RequestMapping("/especial/excluiInstituicao/{id}")
	public String excluir(@PathVariable Long id) {
		
		//this.instituicaoRepository.delete(id);
		
		return "redirect:/especia/instituicoes";
	}
	
	@RequestMapping(value = "/especial/addInstituicao", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:3000")
	public String salvar(@RequestBody Instituicao instituicao, Errors errors) {
		
		if ( errors.hasErrors() ) {
			return "redirect:/especia/istituicoes";
		}
		
		//this.instituicaoRepository.saveAcesso(instituicao.getAcesso());
		this.instituicaoRepository.save(instituicao);
		
		return "redirect:/especia/istituicoes";
	}
	@RequestMapping("/editacliente/{cliente}")
	public ModelAndView editar(@PathVariable Endereco cliente) {
		
		ModelAndView mv = new ModelAndView("EditaCliente");
		
		mv.addObject(cliente);
		
		return mv;
	}
	@RequestMapping("/especial/editaInstituicao/{instituicao}")
	public ModelAndView editar(@PathVariable Instituicao instituicao) {
		
		ModelAndView mv = new ModelAndView("EditaInstituicao");
		
		mv.addObject(instituicao);
		
		return mv;
	}
	
	@RequestMapping("/especia/alteraInstituicao")
	public String editaralterar(@Validated Instituicao instituicao) {
		
		this.instituicaoRepository.save(instituicao);

		return "redirect:/especia/istituicoes";
	}
	
	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
	
	

	
}














