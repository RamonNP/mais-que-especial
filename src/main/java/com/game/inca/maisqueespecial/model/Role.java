package com.game.inca.maisqueespecial.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority{

	@Id
	@Column(name="NOMEROLE")
	private String NOMEROLE;

	@ManyToMany(mappedBy = "roles")
    private List<Acesso> Acesso;
    
    
	
//	public Role(String nomeRole) {
//		super();
//		this.nomeRole = nomeRole;
//	}


	
	
	public String getNOMEROLE() {
		return NOMEROLE;
	}




	public void setNOMEROLE(String nOMEROLE) {
		NOMEROLE = nOMEROLE;
	}




	public List<Acesso> getAcesso() {
		return Acesso;
	}

	public void setAcesso(List<Acesso> acesso) {
		Acesso = acesso;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.NOMEROLE;
	}
	
	
}
