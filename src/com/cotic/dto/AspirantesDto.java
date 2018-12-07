package com.cotic.dto;

public class AspirantesDto {
	private Integer idAspirante;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String calle;
	private String numero;

	public AspirantesDto() {
	}

	public AspirantesDto(Integer idAspirante, String nombre, String apPaterno,
			String apMaterno, String calle, String numero) {
		this.idAspirante = idAspirante;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.calle = calle;
		this.numero = numero;
	}

	public Integer getIdAspirante() {
		return idAspirante;
	}

	public void setIdAspirante(Integer idAspirante) {
		this.idAspirante = idAspirante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
