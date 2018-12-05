package com.lafilabuena.dao;

import com.lafilabuena.model.Contacto;

public interface GenericDao<T> {

	public T crear();
	public void listar();
}
