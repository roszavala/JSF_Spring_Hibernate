package com.cotic.dao;

import java.util.List;

import com.cotic.eo.AspirantesEo;

public interface RegistroDao extends GenericDao<AspirantesEo, Integer> {
	public List<AspirantesEo> buscarNombre(String nombre);

}
