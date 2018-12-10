/**
 * 
 * 
 * @author Mario Alcañiz
 * fecha: 05/12/18
 * version 1.0
 *
 */

package com.lafilabuena.services;


import org.springframework.beans.factory.annotation.Autowired;

import com.lafilabuena.dao.ContactoRepository;




public class ContactosServicesImpl implements GenericServices{
	
	@Autowired
	private ContactoRepository contacto;
	
	
	@Override
	public void crear() {
		// TODO Auto-generated method stub
		//contacto.crear();
		
	}
	
	@Override
	public void borrar() {
		// TODO Auto-generated method stub
//		contacto.borrar();
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
//		contacto.editar();
	}

	@Override
	public <T> void buscar() {
		// TODO Auto-generated method stub
//		contacto.buscar();
	}

	@Override
	public void FichaDetallada() {
		// TODO Auto-generated method stub
//		contacto.FichaDetallada();
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
//		contacto.listar();
	}
	

}
