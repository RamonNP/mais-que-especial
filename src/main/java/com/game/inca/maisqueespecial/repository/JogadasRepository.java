package com.game.inca.maisqueespecial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.inca.maisqueespecial.model.Jogadas;

public interface JogadasRepository extends JpaRepository<Jogadas, String> {
	//Usuario findByDescLogin(String descLogin);
}