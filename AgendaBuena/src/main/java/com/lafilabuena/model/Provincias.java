package com.lafilabuena.model;


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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincias [idprovincia=");
		builder.append(idprovincia);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append("]");
		return builder.toString();
	}

	

}
