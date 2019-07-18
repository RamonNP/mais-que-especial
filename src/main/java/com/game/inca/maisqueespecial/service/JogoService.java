package com.game.inca.maisqueespecial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.game.inca.maisqueespecial.repository.JogoRepository;

@Repository
public class JogoService {
	
	@Autowired
	private JogoRepository jRepository;

}
