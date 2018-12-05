package com.lafilabuena.tests;

import org.springframework.data.repository.CrudRepository;

import com.lafilabuena.model.Contacto;

@Repository
public interface ArticleRepository extends CrudRepository<Contacto, Long>  {

}
