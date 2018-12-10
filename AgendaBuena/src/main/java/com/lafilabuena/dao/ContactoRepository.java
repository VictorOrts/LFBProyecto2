package com.lafilabuena.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lafilabuena.model.Contacto;
import com.lafilabuena.model.Direccion;
import com.lafilabuena.model.Provincias;
import com.lafilabuena.util.LecturaDatos;


/**Método crear Contacto
 * 
 * @author Jorge A Avilés Menéndez
 *
 */
@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Serializable>{


}
