package com.lafilabuena.dao;

import java.io.Serializable;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lafilabuena.model.Contacto;
import com.lafilabuena.model.Provincias;




/**Método crear Contacto
 * 
 * @author Jorge A Avilés Menéndez
 *
 */
@Repository("provinciasRepository")
public interface ProvinciasRepository extends JpaRepository<Provincias,Integer>{


}
