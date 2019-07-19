package com.game.inca.maisqueespecial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebConfig implements WebMvcConfigurer {
	 @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurerAdapter() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**")
	                        .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH", "OPTIONS");
	            }
	        };
	    }

//	 @Override
//	    public void addCorsMappings(CorsRegistry registry) {
//	        String headers;
//			registry.addMapping("/**")
//			//.allowedHeaders(headers)
////	        .allowedOrigins("*")
////	        .allowedOrigins("*")
////	        .allowedHeaders("https://maisqueespecialgames.herokuapp.com/")
//	        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT")
//	        .allowCredentials(false)
//	        .maxAge(3600)
//	        ;
//	    }
}
