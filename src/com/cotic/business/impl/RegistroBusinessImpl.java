package com.cotic.business.impl;

import java.util.ArrayList;
import java.util.List;

import com.cotic.business.RegistroBusiness;
import com.cotic.dao.RegistroDao;
import com.cotic.dto.AspirantesDto;
import com.cotic.eo.AspirantesEo;

public class RegistroBusinessImpl implements RegistroBusiness {

	private RegistroDao registroDao;

	/**
	 * Metodo para registra un nuevo aspirante
	 */
	@Override
	public boolean registrar(String nombre, String apPaterno, String apMaterno,
			String calle, String numero) {
		try {
			registroDao.agregar(new AspirantesEo(null, nombre, apPaterno,
					apMaterno, calle, numero));

		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	/**
	 * Metodo para eliminar un aspirante
	 */
	@Override
	public boolean eliminar(Integer id) {
		try {
			// primero busca que exista y despues lo elimina el registro
			registroDao.eliminar(registroDao.buscar(id));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Modifica un registro
	 */
	@Override
	public boolean modificar(Integer id, String nombre, String apPaterno,
			String apMaterno, String calle, String numero) {
		try {
			registroDao.modificar(new AspirantesEo(id, nombre, apPaterno,
					apMaterno, calle, numero));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Trae todos los registro de aspirantes
	 */
	@Override
	public List<AspirantesDto> consultar() {
		List<AspirantesEo> lst = registroDao.consultar();
		List<AspirantesDto> lstDto = new ArrayList<AspirantesDto>();
		for (AspirantesEo ob : lst) {
			lstDto.add(new AspirantesDto(ob.getIdAspirante(), ob.getNombre(),
					ob.getApPaterno(), ob.getApMaterno(), ob.getCalle(), ob
							.getNumero()));
		}
		return lstDto;
	}

	public void setRegistroDao(RegistroDao registroDao) {
		this.registroDao = registroDao;
	}

}
