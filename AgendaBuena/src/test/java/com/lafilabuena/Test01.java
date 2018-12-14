package com.lafilabuena;
/**Clase Test01
 *  para comprobar que el controlador funciona
 * @author Jorge A Avilés Menéndez
 */
import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lafilabuena.controller.ContactosController;


// TODO: Auto-generated Javadoc
/**
 * The Class Test01.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test01 {

	/** The contactos controller. */
	@Autowired
	private ContactosController contactosController;
	
	/**
	 * Contex loads.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void contexLoads() throws Exception {
		assertThat(contactosController).isNotNull();
	}
	
}
