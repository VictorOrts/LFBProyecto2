package com.lafilabuena.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Direccion.
 * 
 * @author Jorge Aviles
 */
@Entity
@Table(name = "direccion")
public class Direccion {

	/** The iddireccion. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iddireccion")
	private int iddireccion;

	/** The direccion. */
	@Column(name = "direccion")
	private String direccion;

	/** The codpostal. */
	@Column(name = "codpostal")
	private int codpostal;

	/** The localidad. */
	@Column(name = "localidad")
	private String localidad;

	/** The idpersona. */
	@Column(name = "idpersona")
	private int idpersona;

	/** The idprovincia. */
	@Column(name = "idprovincia")
	private int idprovincia;

	/**
	 * Instantiates a new direccion.
	 */
	public Direccion() {

	}

	/**
	 * Gets the iddireccion.
	 *
	 * @return the iddireccion
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIddireccion() {
		return iddireccion;
	}

	/**
	 * Sets the iddireccion.
	 *
	 * @param iddireccion the new iddireccion
	 */
	public void setIddireccion(int iddireccion) {
		this.iddireccion = iddireccion;
	}

	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Gets the codpostal.
	 *
	 * @return the codpostal
	 */
	public int getCodpostal() {
		return codpostal;
	}

	/**
	 * Sets the codpostal.
	 *
	 * @param codpostal the new codpostal
	 */
	public void setCodpostal(int codpostal) {
		this.codpostal = codpostal;
	}

	/**
	 * Gets the localidad.
	 *
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * Sets the localidad.
	 *
	 * @param localidad the new localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Direccion [iddireccion=" + iddireccion + ", direccion=" + direccion + ", codpostal=" + codpostal
				+ ", localidad=" + localidad + ", idpersona=" + idpersona + ", idprovincia=" + idprovincia + "]";
	}

}