package com.lafilabuena.tests;

import org.springframework.data.repository.CrudRepository;

import com.lafilabuena.model.Contacto;

public interface ArticleRepository extends CrudRepository<Contacto, Long>  {

}
