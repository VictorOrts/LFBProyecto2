/**
 * 
 * 
 * @author Mario Alcañiz
 * fecha: 05/12/18
 * version 1.0
 *
 */
package com.lafilabuena.services;

import org.springframework.stereotype.Service;

@Service("genericServices")
public interface GenericServices {
	public void crear();
	public void borrar();
	public void editar();
	public <T> void buscar(); 
	public void FichaDetallada();
	public void listar();

}
