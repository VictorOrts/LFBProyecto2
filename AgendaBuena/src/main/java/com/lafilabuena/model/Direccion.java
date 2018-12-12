package com.lafilabuena.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="direccion")
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iddireccion")
	private int iddireccion;
	private String direccion;
	private int codpostal;
	private String localidad;
    @OneToOne
    @JoinColumn(name = "idprovincia",referencedColumnName="idprovincia")
	private Provincias provincia;
    @OneToOne
    @JoinColumn(name = "idpersona",referencedColumnName="idpersona")
	private Contacto persona;
	
	public Direccion() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(int iddireccion) {
		this.iddireccion = iddireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(int codpostal) {
		this.codpostal = codpostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public Provincias getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincias provincia) {
		this.provincia = provincia;
	}
	public Contacto getPersona() {
		return persona;
	}
	public void setPersona(Contacto persona) {
		this.persona = persona;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [iddireccion=");
		builder.append(iddireccion);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", codpostal=");
		builder.append(codpostal);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", persona=");
		builder.append(persona);
		builder.append("]");
		return builder.toString();
	}

	






	
}
