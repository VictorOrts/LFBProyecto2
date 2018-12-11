/**
* Contacto Class
* 
* @author Victor Orts
* @version 2.0
*/

package com.lafilabuena.model;

import java.util.Date;
import com.lafilabuena.model.Provincias;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
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
	@Column(name="direccion")
	private String direccion;
	

	
	
	@Column(name="provincia")
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="personas_provincias", joinColumns=@JoinColumn(name="idprovincias",referencedColumnName="idprovincias"),
	   inverseJoinColumns=@JoinColumn(name="idpersona",referencedColumnName="idpersonas"))
	private Provincias provincia;
	
	public Contacto() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param dni
	 * @param fechanacimiento
	 * @param telefono1
	 * @param telefono2
	 * @param telefono3
	 * @param telefono4
	 * @param telefono5
	 * @param direccion
	 * @param provincia
	 */
	public Contacto(int id,
			@NotEmpty(message = "Introduce un nombre, por favor") @Length(min = 3, message = "Tu nombre debe tener al menos 3 caracteres") String nombre,
			String apellido1, String apellido2, String dni, Date fechanacimiento,
			@NotEmpty(message = "Introduce un teléfono, por favor") @Length(min = 9, message = "Tu teléfono debe tener 9 dígitos") int telefono1,
			int telefono2, int telefono3, int telefono4, int telefono5, String direccion, Provincias provincia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.telefono3 = telefono3;
		this.telefono4 = telefono4;
		this.telefono5 = telefono5;
		this.direccion = direccion;
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
	 * @return the telefono1
	 */
	public int getTelefono1() {
		return telefono1;
	}

	/**
	 * @param telefono1 the telefono1 to set
	 */
	public void setTelefono1(int telefono1) {
		this.telefono1 = telefono1;
	}

	/**
	 * @return the telefono2
	 */
	public int getTelefono2() {
		return telefono2;
	}

	/**
	 * @param telefono2 the telefono2 to set
	 */
	public void setTelefono2(int telefono2) {
		this.telefono2 = telefono2;
	}

	/**
	 * @return the telefono3
	 */
	public int getTelefono3() {
		return telefono3;
	}

	/**
	 * @param telefono3 the telefono3 to set
	 */
	public void setTelefono3(int telefono3) {
		this.telefono3 = telefono3;
	}

	/**
	 * @return the telefono4
	 */
	public int getTelefono4() {
		return telefono4;
	}

	/**
	 * @param telefono4 the telefono4 to set
	 */
	public void setTelefono4(int telefono4) {
		this.telefono4 = telefono4;
	}

	/**
	 * @return the telefono5
	 */
	public int getTelefono5() {
		return telefono5;
	}

	/**
	 * @param telefono5 the telefono5 to set
	 */
	public void setTelefono5(int telefono5) {
		this.telefono5 = telefono5;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the provincia
	 */
//	public Provincias getProvincia() {
//		return provincia;
//	}

	/**
	 * @param provincia the provincia to set
	 */
//	public void setProvincia(Provincias provincia) {
//		this.provincia = provincia;
//	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
		builder.append(", telefono1=");
		builder.append(telefono1);
		builder.append(", telefono2=");
		builder.append(telefono2);
		builder.append(", telefono3=");
		builder.append(telefono3);
		builder.append(", telefono4=");
		builder.append(telefono4);
		builder.append(", telefono5=");
		builder.append(telefono5);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", provincia=");
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
