package com.game.inca.maisqueespecial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class MaisQueEspecialApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaisQueEspecialApplication.class, args);
		System.out.print(new BCryptPasswordEncoder().encode("123"));
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurerAdapter() {
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/**").allowedOrigins("https://maisqueespecialgames.herokuapp.com");
	        }
	    };
	}
}
