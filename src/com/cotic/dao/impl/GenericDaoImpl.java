package com.cotic.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cotic.dao.GenericDao;

public class GenericDaoImpl<T, ID extends Serializable> extends
		HibernateDaoSupport implements GenericDao<T, ID> {

	private Class<T> type;

	public GenericDaoImpl(Class<T> type) {
		this.type = type;
	}

	@Override
	public List<T> consultar() {
		return (List<T>) getHibernateTemplate().loadAll(type);
	}

	@Override
	public void modificar(T obj) {
		getHibernateTemplate().update(obj);
	}

	@Override
	public ID agregar(T obj) {
		return (ID) getHibernateTemplate().save(obj);
	}

	@Override
	public T buscar(ID id) {
		return (T) getHibernateTemplate().get(type, id);
	}

	@Override
	public void eliminar(T obj) {
		getHibernateTemplate().delete(obj);
	}

}
