package com.game.inca.maisqueespecial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MaisQueEspecialApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaisQueEspecialApplication.class, args);
		System.out.print(new BCryptPasswordEncoder().encode("123"));
	}
	
}
