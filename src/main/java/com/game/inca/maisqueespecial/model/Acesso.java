package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;




/**
 * The persistent class for the acesso database table.
 * 
 */
@Entity
@NamedQuery(name="Acesso.findAll", query="SELECT a FROM Acesso a")
public class Acesso implements UserDetails, Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nridacesso;

	@Column(name="DESCEMAIL")
	private String descEmail;

	@Column(name="DESCLOGIN")
	private String descLogin;

	@Column(name="DESCSENHA")
	private String descSenha;

	@ManyToMany
	@JoinTable( 
	        name = "ACESSO_has_Role", 
	        joinColumns = @JoinColumn(
	          name = "nridacesso", referencedColumnName = "NRIDACESSO"), 
	        inverseJoinColumns = @JoinColumn(
	          name = "NOMEROLE", referencedColumnName = "NOMEROLE")) 
    private List<Role> roles;
	
    
    
	public Acesso() {
		super();
		//roles = new ArrayList<Role>();
		//roles.add(new Role("ADMIN"));
	}

	public int getNridacesso() {
		return nridacesso;
	}

	public void setNridacesso(int nridacesso) {
		this.nridacesso = nridacesso;
	}

	public String getDescEmail() {
		return descEmail;
	}

	public void setDescEmail(String descEmail) {
		this.descEmail = descEmail;
	}

	public String getDescLogin() {
		return descLogin;
	}

	public void setDescLogin(String descLogin) {
		this.descLogin = descLogin;
	}

	public String getDescSenha() {
		return descSenha;
	}

	public void setDescSenha(String descSenha) {
		this.descSenha = descSenha;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return (Collection<? extends GrantedAuthority>) this.roles;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.descSenha;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.descLogin;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	


}