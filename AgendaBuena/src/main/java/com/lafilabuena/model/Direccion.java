package com.lafilabuena.model;
/**Clase Direccion
 * 
 * @author Jorge A Avilés Menéndez
 *
 */
public class Direccion {

	private String domicilio;
	
	private String localidad;
	
	private int codigoPostal;
	
	private Provincias provincia;

	public Direccion() {
		
	}

	public Direccion(String domicilio, int codigoPostal, Provincias provincia) {
		super();
		this.domicilio = domicilio;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
	}

	/**
	 * @return the domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}

	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	/**
	 * @return the codigoPostal
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return the provincia
	 */
	public Provincias getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(Provincias provincia) {
		this.provincia = provincia;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
	
}
