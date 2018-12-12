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


@RunWith(SpringRunner.class)
@SpringBootTest
public class Test04 {
	
	@Autowired
	private ContactosServicesImpl contactosServices;
	
	@Test
	
	public void buscarContacto() throws Exception{
		contactosServices.buscarNombre("Victor");
		

		
		
		
		
		
		

		
		
		
		
		
	}
	
	
	

}
