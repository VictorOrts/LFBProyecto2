package com.lafilabuena.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lafilabuena.model.Telefono;

/**
 * The Interface TelefonoRepository.
 * 
 * @author Jose M Vicente
 */
@Repository("telefonoRepository")
public interface TelefonoRepository extends JpaRepository<Telefono, Integer> {

}
