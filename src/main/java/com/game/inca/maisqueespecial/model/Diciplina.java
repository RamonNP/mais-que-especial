package com.game.inca.maisqueespecial.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the diciplina database table.
 * 
 */
@Entity
@NamedQuery(name="Diciplina.findAll", query="SELECT d FROM Diciplina d")
public class Diciplina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int nriddiciplina;

	private String descdiciplina;

	private String descnome;

	public Diciplina() {
	}

	public int getNriddiciplina() {
		return this.nriddiciplina;
	}

	public void setNriddiciplina(int nriddiciplina) {
		this.nriddiciplina = nriddiciplina;
	}

	public String getDescdiciplina() {
		return this.descdiciplina;
	}

	public void setDescdiciplina(String descdiciplina) {
		this.descdiciplina = descdiciplina;
	}

	public String getDescnome() {
		return this.descnome;
	}

	public void setDescnome(String descnome) {
		this.descnome = descnome;
	}

}