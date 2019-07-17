package com.game.inca.maisqueespecial.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.game.inca.maisqueespecial.model.Jogo;


public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
	@Query(value = "SELECT J.* FROM JOGO J,JOGOALUNO JA, ALUNO AL, ACESSO A  \n" + 
			"	WHERE  J.nridjogo = JA.nridjogo\n" + 
			"	AND    JA.nridaluno = AL.nridaluno\n" + 
			"	AND    AL.nridacesso = A.nridacesso\n" + 
			"	AND    A.desclogin = ?1", nativeQuery = true)
	ArrayList<Jogo> findByLogin(String login);
	Jogo findByNridjogo(int id);

}
