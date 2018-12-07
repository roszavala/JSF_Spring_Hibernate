package com.cotic.business;

import java.util.List;

import com.cotic.dto.AspirantesDto;

public interface RegistroBusiness {
	public boolean registrar(String nombre, String apPaterno, String apMaterno,
			String calle, String numero);

	public boolean eliminar(Integer id);

	public boolean modificar(Integer id, String nombre, String apPaterno,
			String apMaterno, String calle, String numero);

	public List<AspirantesDto> consultar();

}
