package com.cotic.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;

import com.cotic.business.RegistroBusiness;
import com.cotic.dto.AspirantesDto;


public class RegistroController implements Serializable {

	private RegistroBusiness registroBusiness;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String calle;
	private String numero;
	private Integer idAspirante;
	private List<AspirantesDto> aspirantes;
	private HtmlDataTable tabla;
	private AspirantesDto aspirantesDto;

	public RegistroController() {

	}

	/**
	 * Guarda los datos para el editar
	 * 
	 * @return
	 */
	public String guardar() {
		seleccionar();
		if (registroBusiness.modificar(idAspirante, nombre, apPaterno, apMaterno,
				calle,numero)) {
			FacesContext
					.getCurrentInstance()
					.addMessage(
							null,
							new FacesMessage(
									"El registro se ha modificado correctamente"));
			limpiarCampos();

		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("No se pudo modificar el registro"));

		}
		return null;
	}

	/**
	 * Obtiene el registro que se selecciona al presionar el boton editar o
	 * eliminar
	 */
	private void seleccionar() {
		aspirantesDto = (AspirantesDto) tabla.getRowData();
		idAspirante = aspirantesDto.getIdAspirante();
	}

	/**
	 * Paso los datos al formulario
	 */
	private void llenarDatos() {
		nombre = aspirantesDto.getNombre();
		apPaterno = aspirantesDto.getApPaterno();
		apMaterno = aspirantesDto.getApMaterno();
		calle = aspirantesDto.getCalle();
		numero = aspirantesDto.getNumero();
	}

	/**
	 * Realiza la funcion de eliminar un registro
	 * 
	 * @return
	 */
	public String eliminar() {
		seleccionar();
		registroBusiness.eliminar(idAspirante);
		return null;
	}

	/**
	 * Realiza la funcion de modificar un registro, pero solo seleccionar el
	 * registro y llena los datos de fomulario
	 * 
	 * @return
	 */
	public String modificar() {
		seleccionar();
		llenarDatos();
		return null;
	}

	public Integer getIdAspirante() {
		return idAspirante;
	}

	public void setIdAspirante(Integer idAspirante) {
		this.idAspirante = idAspirante;
	}

	/**
	 * Limpia los campos de formulario
	 */
	private void limpiarCampos() {
		nombre = "";
		apPaterno = "";
		apMaterno = "";
		calle = "";
		numero = "";
	}

	/**
	 * Agrega un nuevo registro desde el formulario y se ve reflejado en la
	 * tabla, manda mensaje de exito al agregar
	 * 
	 * @return
	 */
	public String registrar() {
		if (registroBusiness.registrar(nombre, apPaterno, apMaterno, calle,
				numero)) {
			FacesContext
					.getCurrentInstance()
					.addMessage(
							null,
							new FacesMessage(
									"El registro se ha agregado correctamente"));
			limpiarCampos();

		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("No se pudo agregar el registro"));

		}
		return null;
	}

	public List<AspirantesDto> getAspirantes() {
		return registroBusiness.consultar();
	}

	public void setAspirantes(List<AspirantesDto> aspirantes) {
		this.aspirantes = aspirantes;
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

	public HtmlDataTable getTabla() {
		return tabla;
	}

	public void setTabla(HtmlDataTable tabla) {
		this.tabla = tabla;
	}

	public void setRegistroBusiness(RegistroBusiness registroBusiness) {
		this.registroBusiness = registroBusiness;
	}

}
