package com.game.inca.maisqueespecial.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.game.inca.maisqueespecial.service.ImplementsUserDetailsService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Autowired
	private ImplementsUserDetailsService userDetailsService;
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.authorizeRequests()
//				.antMatchers("/css/**", "/index").permitAll()		
//				.antMatchers("/user/**").hasRole("USER")			
//				.and()
//				.formLogin()
//				.loginPage("/login").failureUrl("/login-error");	
//	}
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//			.inMemoryAuthentication()
//			.withUser("user").password("password").roles("USER");
//	}

	
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests()
			.antMatchers("/sistema-transp/especia/instituicoes").permitAll()
			.antMatchers("/listaGames").permitAll()
			.antMatchers("/listaGamesPorUsuario/*").permitAll()
			.antMatchers("*/especial/listaGamesPorUsuario/*").permitAll()
			.antMatchers("/static/*").permitAll()
			.antMatchers("/users").permitAll()
			.antMatchers("/especial/addInstituicao").permitAll()
			.antMatchers(HttpMethod.POST, "/login").permitAll()
			.anyRequest().authenticated()
			.and()
			
			// filtra requisi de login
			.addFilterBefore(new JWTLoginFilter("/login", authenticationManager()),
	                UsernamePasswordAuthenticationFilter.class)
			
			// filtra outras requisi para verificar a presen�a do JWT no header
			.addFilterBefore(new JWTAuthenticationFilter(),
	                UsernamePasswordAuthenticationFilter.class);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/materialize/**", "/style/**");
	}
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// cria uma conta default
////		auth.inMemoryAuthentication()
////        .withUser("user").password("{noop}password").roles("USER")
////        .and()
////        .withUser("ramon").password("{noop}ramon123").roles("ADMIN");
//		
//	}
	
}
