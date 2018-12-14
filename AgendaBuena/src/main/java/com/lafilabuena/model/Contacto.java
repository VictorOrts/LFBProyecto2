
package com.lafilabuena.model;
/**
* Contacto Class
* 
* @author Victor Orts
* @version 2.0 05/12/2018
*/

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


/**
 * The Class Contacto.
 */
@Entity
@Table(name = "persona")

public class Contacto {
	
	/** The idpersona. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idpersona")
	private int idpersona;
	
	/** The nombre. */
	@Column(name = "nombre")
	@NotEmpty(message = "Introduce un nombre, por favor")
	@Length(min = 3, message = "Tu nombre debe tener al menos 3 caracteres")
	private String nombre;
	
	/** The apellido 1. */
	@Column(name = "apellido1")
	private String apellido1;
	
	/** The apellido 2. */
	@Column(name = "apellido2")
	private String apellido2;
	
	/** The dni. */
	@Column(name = "dni")
	private String dni;
	
	/** The fechanacimiento. */
	@Column(name = "fechanacimiento")
	private Date fechanacimiento;
	
	/**
	 * Instantiates a new contacto.
	 */
	public Contacto() {

	}

	

	/**
	 * Gets the idpersona.
	 *
	 * @return the idpersona
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Gets the apellido 1.
	 *
	 * @return the apellido 1
	 */
	public String getApellido1() {
		return apellido1;
	}


	/**
	 * Sets the apellido 1.
	 *
	 * @param apellido1 the new apellido 1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	/**
	 * Gets the apellido 2.
	 *
	 * @return the apellido 2
	 */
	public String getApellido2() {
		return apellido2;
	}


	/**
	 * Sets the apellido 2.
	 *
	 * @param apellido2 the new apellido 2
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * Sets the dni.
	 *
	 * @param dni the new dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * Gets the fechanacimiento.
	 *
	 * @return the fechanacimiento
	 */
	public Date getFechanacimiento() {
		return fechanacimiento;
	}


	/**
	 * Sets the fechanacimiento.
	 *
	 * @param fechanacimiento the new fechanacimiento
	 */
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [idpersona=");
		builder.append(idpersona);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido1=");
		builder.append(apellido1);
		builder.append(", apellido2=");
		builder.append(apellido2);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", fechanacimiento=");
		builder.append(fechanacimiento);
		builder.append("]");
		return builder.toString();
	}



	

}
