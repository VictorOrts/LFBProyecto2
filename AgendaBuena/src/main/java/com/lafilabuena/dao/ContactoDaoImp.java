package com.lafilabuena.dao;

import java.util.ArrayList;
import java.util.Date;

import com.lafilabuena.model.Contacto;
import com.lafilabuena.model.Direccion;
import com.lafilabuena.model.Provincias;
import com.lafilabuena.util.LecturaDatos;


/**Método crear Contacto
 * 
 * @author Jorge A Avilés Menéndez
 *
 */
public class ContactoDaoImp implements GenericDao{

	ArrayList<Contacto> listaContacto =new ArrayList<>();
	
	public Contacto crear() {
		/*System.out.println("Introduce Provincia: ");
		String prov2;
		try {
			prov2 = LecturaDatos.lecturaDatosString();
			int tmp = prov2.length();
			String tmp2 = prov2.substring(0, 1).toUpperCase();
			tmp2+=prov2.substring(1,tmp);
			System.out.println(tmp2);
			System.out.println(Provincias.valueOf(tmp2).getLevelCode());
			Provincias thisprovi = Provincias.valueOf(tmp2);
			System.out.println(thisprovi);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
		Contacto c1=new Contacto();
		System.out.println("Creando contacto -->");
		
		try {
		System.out.println("Introduce el nombre: ");
		c1.setNombre(LecturaDatos.lecturaDatosString());
		
		System.out.println("Introduce primer apellido: ");
		c1.setApellido1(LecturaDatos.lecturaDatosString());
		
		System.out.println("Introduce segundo apellido: ");
		c1.setApellido2(LecturaDatos.lecturaDatosString());
		
		System.out.println("Introduce DNI: ");
		c1.setDni(LecturaDatos.lecturaDatosString());
		
		System.out.println("Introduce fecha de nacimiento (Ej:11/6/1994):");
		System.out.println("Día: ");
		int dia=LecturaDatos.lecturaDatosInt();	
		System.out.println("Mes:");
		int mes=LecturaDatos.lecturaDatosInt()-1;
		System.out.println("Año:");
		int anyo=LecturaDatos.lecturaDatosInt()-1900;
		Date fecha=new Date(anyo,mes,dia);
		c1.setFechanacimiento(fecha);
		
		System.out.println("Introduciendo dirección --> ");
		Direccion d1=new Direccion();
		System.out.println("Introduce domicilio (calle,avenida,...):");
		d1.setDomicilio(LecturaDatos.lecturaDatosString());
		System.out.println("Introduce código postal: ");
		d1.setCodigoPostal(LecturaDatos.lecturaDatosInt());
		System.out.println("Introduce Provincia: ");
		String prov2=LecturaDatos.lecturaDatosString();
		int tmp = prov2.length();
		String tmp2 = prov2.substring(0, 1).toUpperCase();
		tmp2+=prov2.substring(1,tmp);
		Provincias thisprovi = Provincias.valueOf(tmp2);
		d1.setProvincia(thisprovi);
		System.out.println("Introduce localidad:");
		d1.setLocalidad(LecturaDatos.lecturaDatosString());
		c1.setDireccion(d1);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		listaContacto.add(c1);
		return c1;
		}
		
	public void listar() {
		
	
		for(Contacto i: listaContacto) {
			System.out.println(i);
		}
	}
}
