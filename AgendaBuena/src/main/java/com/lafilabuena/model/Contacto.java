/**
* Contacto Class
* 
* @author Victor Orts
* @version 2.0
*/

package com.lafilabuena.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
@Entity
@Table(name="persona")

public class Contacto {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="idpersona")
	private int id;
	@Column(name="nombre")
	@NotEmpty(message="Introduce un nombre, por favor")
	@Length(min=3, message="Tu nombre debe tener al menos 3 caracteres")
	private String nombre;
	@Column(name="apellido1")
	private String apellido1;
	@Column(name="apellido2")
	private String apellido2;
	@Column(name="dni")
	private String dni;
	@Column(name="fechanacimiento")
	private Date fechanacimiento;
	@Column(name="telefono1")
	@NotEmpty(message="Introduce un teléfono, por favor")
	@Length(min=9, message="Tu teléfono debe tener 9 dígitos")
	private int telefono1;
	@Column(name="telefono2")
	private int telefono2;
	@Column(name="telefono3")
	private int telefono3;
	@Column(name="telefono4")
	private int telefono4;
	@Column(name="telefono5")
	private int telefono5;
	//@Column(name="direccion")
	//private Direccion direccion;
	public Contacto() {
		
	}
	
	
	public Contacto(int id, String nombre, String apellido1, String apellido2, String dni, Date fechanacimiento
			/*Direccion direccion*/) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
		//this.direccion = direccion;
	}


	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idpersona")
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}
	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}
	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the fechanacimiento
	 */
	public Date getFechanacimiento() {
		return fechanacimiento;
	}
	/**
	 * @param fechanacimiento the fechanacimiento to set
	 */
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	/**
	 * @return the direccion
	 */
//	public Direccion getDireccion() {
//		return direccion;
//	}
//	/**
//	 * @param direccion the direccion to set
//	 */
//	
//	public void setDireccion(Direccion direccion) {
//		this.direccion = direccion;
//	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [id=");
		builder.append(id);
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
		//builder.append(", direccion=");
		//builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	
	
}
