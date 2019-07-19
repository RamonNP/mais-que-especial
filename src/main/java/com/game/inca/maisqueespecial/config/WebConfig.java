package com.game.inca.maisqueespecial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        String headers;
			registry.addMapping("/**")
			//.allowedHeaders(headers)
	        .allowedOrigins("*")
	        .allowedOrigins("*")
	        .allowedHeaders("https://maisqueespecialgames.herokuapp.com/")
	        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT")
	        .allowCredentials(false)
	        .maxAge(3600)
	        ;
	    }
}
