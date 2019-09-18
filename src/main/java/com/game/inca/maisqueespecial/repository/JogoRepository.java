package com.game.inca.maisqueespecial.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.game.inca.maisqueespecial.model.Jogadas;
import com.game.inca.maisqueespecial.model.Jogo;


public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
	@Query(value = "SELECT J.* FROM JOGO J,JOGOALUNO JA, ALUNO AL, ACESSO A  \n" + 
			"	WHERE  J.nridjogo = JA.nridjogo\n" + 
			"	AND    JA.nridaluno = AL.nridaluno\n" + 
			"	AND    AL.nridacesso = A.nridacesso\n" + 
			"	AND    A.desclogin = ?1", nativeQuery = true)
	ArrayList<Jogo> findByLogin(String login);
	Jogo findByNridjogo(int id);
	
	@Query(value = "SELECT JA.nridjogoaluno FROM ALUNO Al, ACESSO A , JOGOALUNO JA  \n" + 
			"	WHERE  AL.nridacesso = A.nridacesso \n" + 
			"	AND    JA.nridaluno = AL.nridaluno \n" + 
			"	AND    A.desclogin = ?1" +
			"	AND    JA.nridJogo = ?2 \n"
			, nativeQuery = true)
	int findAlunoByLogin(String login, int jogo);
	@Query(value ="SELECT J 															\n" +
			"	FROM JOGADAS as J"//                                                   \n" +
//			"	INNER JOIN JOGOALUNO as JA on J.NRIDJOGOALUNO = JA.NRIDJOGOALUNO    \n" +
//			"	INNER JOIN JOGO as JOGO on JOGO.NRIDJOGO = JA.NRIDJOGO              \n" //+
//			"	AND   JOGO.NRIDJOGO = ?1                                            \n" +
//			"	AND   JA.NRIDALUNO = ?2                                             \n" 
			, nativeQuery = true)
	ArrayList<Jogadas> getPlayByUserAndGame(int login, int jogo);


}
