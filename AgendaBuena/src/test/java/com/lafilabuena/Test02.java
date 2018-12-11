/**
 * Test para comprobar que los usuarios tengan nombre
 * 
 * @author Mario Alcañiz
 * fecha: 11/12/18
 * version 1.0
 *
 */

package com.lafilabuena;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lafilabuena.controller.ContactosController;
import com.lafilabuena.model.Contacto;



@RunWith(SpringRunner.class)
@SpringBootTest

public class Test02 {
	

	private Contacto contact;
	private Contacto contact2;
	private Contacto contact3;

	
	
	
	@Test
	public void nombreVacio() throws Exception {
		contact = new Contacto();
		contact2 = new Contacto();
		contact3 = new Contacto();
		
		contact.setNombre("mario");
		contact2.setNombre("");
		contact3.setNombre("marioal");
		
		assertThat(contact.getNombre()).isNotNull();
		assertThat(contact2.getNombre()).isNotNull();
		assertThat(contact3.getNombre()).isNotNull();
		
		
		
		
	}
	
	
	

}
