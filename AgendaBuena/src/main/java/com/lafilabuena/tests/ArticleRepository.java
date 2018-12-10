package com.lafilabuena.tests;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lafilabuena.model.Contacto;

@Repository

public interface ArticleRepository extends JpaRepository<Contacto, Serializable>  {
		public Contacto findById(int id);
		
}
