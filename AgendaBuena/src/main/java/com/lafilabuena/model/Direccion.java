package com.lafilabuena.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="direccion")
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iddireccion")
	private int iddireccion;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "codpostal")
	private int codpostal;
	@Column(name = "localidad")
	private String localidad;
	@Column(name = "idpersona")
    private int idpersona;
	@Column(name = "idprovincia")
    private int idprovincia;
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
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public int getIdprovincia() {
		return idprovincia;
	}
	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}
	@Override
	public String toString() {
		return "Direccion [iddireccion=" + iddireccion + ", direccion=" + direccion + ", codpostal=" + codpostal
				+ ", localidad=" + localidad + ", idpersona=" + idpersona + ", idprovincia=" + idprovincia + "]";
	}

	
}