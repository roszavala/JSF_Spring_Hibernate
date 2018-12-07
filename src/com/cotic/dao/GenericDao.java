package com.cotic.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, ID extends Serializable> {
	public List<T> consultar();

	public void modificar(T obj);

	public ID agregar(T obj);

	public T buscar(ID id);

	public void eliminar(T obj);
}