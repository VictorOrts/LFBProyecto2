package com.lafilabuena.dao;

import java.io.Serializable;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lafilabuena.model.Contacto;




/**Método crear Contacto
 * 
 * @author Jorge A Avilés Menéndez
 *
 */
@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Serializable>{


}
