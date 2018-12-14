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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.lafilabuena.model.Contacto;



// TODO: Auto-generated Javadoc
/**
 * The Class Test02.
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class Test02 {
	

	/** The contact. */
	private Contacto contact;
	
	/** The contact 2. */
	private Contacto contact2;
	
	/** The contact 3. */
	private Contacto contact3;

	
	
	
	/**
	 * Nombre vacio.
	 *
	 * @throws Exception the exception
	 */
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
