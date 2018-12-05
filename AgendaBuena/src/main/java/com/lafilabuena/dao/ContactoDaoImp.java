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
		
		System.out.println("Introduce fecha de nacimiento");
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
}
