package com.game.inca.maisqueespecial.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	
	
	public Usuario(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Id
    private String id;
    private String name;
    private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
}