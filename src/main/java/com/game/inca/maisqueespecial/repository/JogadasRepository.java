package com.game.inca.maisqueespecial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.inca.maisqueespecial.model.Jogada;

public interface JogadasRepository extends JpaRepository<Jogada, String> {
	//Usuario findByDescLogin(String descLogin);
}