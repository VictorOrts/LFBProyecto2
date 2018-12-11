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
@Table(name="provincia")
public class Provincias {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="idprovincia")
	private int idprovincia;
	@Column(name="provincia")
	private String provincia;
	
	public Provincias() {
		
	}

	/**
	 * @param id
	 * @param provincia
	 */
	public Provincias(int idprovincia, String provincia) {
		super();
		this.idprovincia = idprovincia;
		this.provincia = provincia;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public int getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
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
		builder.append(idprovincia);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
