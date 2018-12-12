package com.lafilabuena.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefono")

public class Telefono {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idtelefono")
	private int idtelefono;
	@Column(name= "telefono")
	private int telefono;
	@Column(name= "idpersona")
	private int idpersona;
	
	
	public Telefono() {
		
	}
	
	public Telefono(int idtelefono, int telefono, int idpersona) {
		super();
		this.idtelefono=idtelefono;
		this.telefono=telefono;
		this.idpersona=idpersona;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIdtelefono() {
		return idtelefono;
	}


	public void setIdtelefono(int idtelefono) {
		this.idtelefono = idtelefono;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public int getIdpersona() {
		return idpersona;
	}


	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

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
