package com.cotic.dao.impl;

import java.util.List;

import com.cotic.dao.RegistroDao;
import com.cotic.eo.AspirantesEo;

public class RegistroDaoImpl extends GenericDaoImpl<AspirantesEo, Integer>
		implements RegistroDao {

	public RegistroDaoImpl() {
		super(AspirantesEo.class);
	}

	@Override
	public List<AspirantesEo> buscarNombre(String nombre) {
		return getHibernateTemplate().find(
				"select o from AspirantesEo where o.nombre=?", nombre);
	}

}
