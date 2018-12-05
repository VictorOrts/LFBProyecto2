package com.lafilabuena.util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LecturaDatos {

	public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	private static final Logger logger = LogManager.getLogger("LecturaDatos.class");
	
	
	
	
	public static String lecturaDatosString() throws Exception{
		String dato=teclado.readLine();
		return dato;
	}
	
	public static int lecturaDatosInt() throws Exception {
		String dato = teclado.readLine();
		if (dato.length() > 0) {
			for (int i = 0; i < dato.length(); i++) {
				if (dato.charAt(i) >= (char) 48 && dato.charAt(i) <= (char) 57) {

				} else {
					logger.warn("Introdujiste letras!!");
					return 0;
				}
			}
			int tmp = Integer.parseInt(dato);
			return tmp;

		} else {
			return -1;
		}

	}
	
	
	
	
}
