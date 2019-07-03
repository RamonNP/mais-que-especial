package com.game.inca.maisqueespecial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.inca.maisqueespecial.model.Acesso;

public interface  AcessoRepository extends JpaRepository<Acesso, String>{

	Acesso findByDescLogin(String descLogin);
}