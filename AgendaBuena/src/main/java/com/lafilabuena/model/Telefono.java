/**
 * Clase telefono
 * 
 * @author Mario Alcañiz
 * fecha: 12/12/18
 * version 1.0
 *
 */

package com.lafilabuena.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Telefono.
 */
@Entity
@Table(name = "telefono")

public class Telefono {

	/** The idtelefono. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idtelefono")
	private int idtelefono;

	/** The telefono. */
	@Column(name = "telefono")
	private String telefono;

	/** The idpersona. */
	@Column(name = "idpersona")
	private int idpersona;

	/**
	 * Instantiates a new telefono.
	 */
	public Telefono() {

	}

	/**
	 * Instantiates a new telefono.
	 *
	 * @param idtelefono the idtelefono
	 * @param telefono the telefono
	 * @param idpersona the idpersona
	 */
	public Telefono(int idtelefono, String telefono, int idpersona) {
		super();
		this.idtelefono = idtelefono;
		this.telefono = telefono;
		this.idpersona = idpersona;
	}

	/**
	 * Gets the idtelefono.
	 *
	 * @return the idtelefono
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIdtelefono() {
		return idtelefono;
	}

	/**
	 * Sets the idtelefono.
	 *
	 * @param idtelefono the new idtelefono
	 */
	public void setIdtelefono(int idtelefono) {
		this.idtelefono = idtelefono;
	}

	/**
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Sets the telefono.
	 *
	 * @param telefono the new telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Gets the idpersona.
	 *
	 * @return the idpersona
	 */
	public int getIdpersona() {
		return idpersona;
	}

	/**
	 * Sets the idpersona.
	 *
	 * @param idpersona the new idpersona
	 */
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IdTelefono [id=");
		builder.append(idtelefono);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", idPersona=");
		builder.append(idpersona);
		builder.append("]");
		return builder.toString();
	}

}
