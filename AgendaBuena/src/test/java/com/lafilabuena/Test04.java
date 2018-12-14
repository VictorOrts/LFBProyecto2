/**
 * Test para encontrar usuarios tras una búsqueda
 * 
 * @author Mario Alcañiz
 * fecha: 11/12/18
 * version 1.0
 *
 */

package com.lafilabuena;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.lafilabuena.services.ContactosServicesImpl;


// TODO: Auto-generated Javadoc
/**
 * The Class Test04.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test04 {
	
	/** The contactos services. */
	@Autowired
	private ContactosServicesImpl contactosServices;
	
	/**
	 * Buscar contacto.
	 *
	 * @throws Exception the exception
	 */
	@Test
	
	public void buscarContacto() throws Exception{
		contactosServices.buscarNombre("Victor");
		

		
		
		
		
		
		

		
		
		
		
		
	}
	
	
	

}
