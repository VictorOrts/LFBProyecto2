package com.lafilabuena.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Clase Provincias
 * 
 * @author Jorge A Avilés Menéndez
 *
 */


@Entity
@Table(name="provincias")
public class Provincias {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="idprovincia")
	private int id;
	@Column(name="provincia")
	private String provincia;
	
	public Provincias() {
		
	}

	/**
	 * @param id
	 * @param provincia
	 */
	public Provincias(int id, String provincia) {
		super();
		this.id = id;
		this.provincia = provincia;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincias [id=");
		builder.append(id);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
