package com.game.inca.maisqueespecial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.inca.maisqueespecial.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, String> {
	Aluno findByNridaluno(int nridaluno);
}