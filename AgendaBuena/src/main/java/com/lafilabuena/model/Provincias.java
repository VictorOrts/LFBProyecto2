package com.lafilabuena.model;

/**
 * Clase Provincias
 * 
 * @author Jorge A Avilés Menéndez
 * @version 1.0 11/12/2018
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Provincias.
 */
@Entity
@Table(name = "provincia")
public class Provincias {

	/** The idprovincia. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idprovincia")
	private int idprovincia;

	/** The provincia. */
	@Column(name = "provincia")
	private String provincia;

	/**
	 * Instantiates a new provincias.
	 */
	public Provincias() {

	}

	/**
	 * Gets the idprovincia.
	 *
	 * @return the idprovincia
	 */
	public int getIdprovincia() {
		return idprovincia;
	}

	/**
	 * Sets the idprovincia.
	 *
	 * @param idprovincia the new idprovincia
	 */
	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	/**
	 * Gets the provincia.
	 *
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * Sets the provincia.
	 *
	 * @param provincia the new provincia
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincias [idprovincia=");
		builder.append(idprovincia);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append("]");
		return builder.toString();
	}

}
