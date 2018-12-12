package com.lafilabuena.model;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincias {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idprovincia")
	private int idprovincia;
	@Column(name = "provincia")
	private String provincia;
	@OneToMany(mappedBy="direccion")
	private Direccion direccion;
	
	public Provincias() {

	}
	public int getIdprovincia() {
		return idprovincia;
	}
	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincias [idprovincia=");
		builder.append(idprovincia);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}

	

}
