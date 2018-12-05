package com.lafilabuena.dao;

import com.lafilabuena.model.Contacto;
import com.lafilabuena.util.LecturaDatos;

public class ContactoDaoImp implements GenericDao{

	public Contacto crear() {
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
		int mes=LecturaDatos.lecturaDatosInt()+1;
		System.out.println("Año:");
		int anyo=LecturaDatos.lecturaDatosInt()-1900;
		Date fecha=new Date(anyo,mes,dia);
		c1.setFechanacimiento(fecha);
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
}
