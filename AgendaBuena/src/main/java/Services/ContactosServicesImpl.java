/**
 * 
 * 
 * @author Mario Alcañiz
 * fecha: 05/12/18
 * version 1.0
 *
 */

package Services;


import com.lafilabuena.dao.ContactoDaoImp;
import Services.GenericServices;



public class ContactosServicesImpl implements GenericServices{
	
	
	private ContactoDaoImp contacto= new ContactoDaoImp();
	
	
	@Override
	public void crear() {
		// TODO Auto-generated method stub
		contacto.crear();
		
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
