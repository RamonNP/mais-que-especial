package com.game.inca.maisqueespecial.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.game.inca.maisqueespecial.model.Jogadas;


public interface JogadaRepository extends JpaRepository<Jogadas, Long>{
	
	@Query(value ="SELECT J.* 															\n" +
			"	FROM JOGADAS as J                                                   \n" +
			"	INNER JOIN JOGOALUNO as JA on J.NRIDJOGOALUNO = JA.NRIDJOGOALUNO    \n" +
			"	INNER JOIN JOGO as JOGO on JOGO.NRIDJOGO = JA.NRIDJOGO              \n" +
			"	AND   JOGO.NRIDJOGO = ?1                                            \n" +
			"	AND   JA.NRIDALUNO = ?2                                             \n" 
			, nativeQuery = true)
	ArrayList<Jogadas> getPlayByUserAndGame(int jogo, int idAluno);


}
