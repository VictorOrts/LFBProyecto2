package com.lafilabuena.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lafilabuena.model.Direccion;

/**
 * @author Mario Alcañiz The Interface DireccionRepository.
 */
@Repository("direccionRepository")
public interface DireccionRepository extends JpaRepository<Direccion, Integer> {

}
