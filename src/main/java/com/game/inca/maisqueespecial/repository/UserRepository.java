package com.game.inca.maisqueespecial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.inca.maisqueespecial.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, String> {
}