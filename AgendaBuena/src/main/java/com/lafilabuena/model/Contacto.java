
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

@Entity
@Table(name = "persona")

public class Contacto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idpersona")
	private int idpersona;
	@Column(name = "nombre")
	@NotEmpty(message = "Introduce un nombre, por favor")
	@Length(min = 3, message = "Tu nombre debe tener al menos 3 caracteres")
	private String nombre;
	@Column(name = "apellido1")
	private String apellido1;
	@Column(name = "apellido2")
	private String apellido2;
	@Column(name = "dni")
	private String dni;
	@Column(name = "fechanacimiento")
	private Date fechanacimiento;


	public Contacto() {

	}

	

	public Contacto(int id,
			@NotEmpty(message = "Introduce un nombre, por favor") @Length(min = 3, message = "Tu nombre debe tener al menos 3 caracteres") String nombre,
			String apellido1, String apellido2, String dni, Date fechanacimiento) {
		super();
		this.idpersona = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIdpersona() {
		return idpersona;
	}


	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Date getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [id=");
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
