package com.lafilabuena.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lafilabuena.model.Telefono;
@Repository("telefonoRepository")
public interface TelefonoRepository extends JpaRepository<Telefono, Integer> {

}
