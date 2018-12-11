package com.lafilabuena;
/**clase Test03
 * comprobar que el metodo crear devuelve un obj que no este vacio
 * @author Jorge A Avilés Menéndez
 */

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lafilabuena.model.Contacto;
import com.lafilabuena.services.ContactosServicesImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test03 {

	@Autowired
	private ContactosServicesImpl contactosServices;
	
	private Contacto c1=new Contacto();
	
	
	
	
	@Test
	public void crearContacto() throws Exception {
		c1.setNombre("jorge");
		c1.setApellido1("Aviles");
		c1.setApellido2("Menendez");
		c1.setDireccion("calle alcalde");
		c1.setDni("5848694E");
		
		assertNotNull(contactosServices.crear(c1));
	}
	
}
