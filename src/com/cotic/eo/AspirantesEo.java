package com.cotic.eo;


public class AspirantesEo {

	private Integer idAspirante;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String calle;
	private String numero;

	public AspirantesEo() {
	}

	public AspirantesEo(Integer idAspirante, String nombre, String apPaterno,
			String apMaterno, String calle, String numero) {
		super();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((apMaterno == null) ? 0 : apMaterno.hashCode());
		result = prime * result
				+ ((apPaterno == null) ? 0 : apPaterno.hashCode());
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result
				+ ((idAspirante == null) ? 0 : idAspirante.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AspirantesEo other = (AspirantesEo) obj;
		if (apMaterno == null) {
			if (other.apMaterno != null)
				return false;
		} else if (!apMaterno.equals(other.apMaterno))
			return false;
		if (apPaterno == null) {
			if (other.apPaterno != null)
				return false;
		} else if (!apPaterno.equals(other.apPaterno))
			return false;
		if (calle == null) {
			if (other.calle != null)
				return false;
		} else if (!calle.equals(other.calle))
			return false;
		if (idAspirante == null) {
			if (other.idAspirante != null)
				return false;
		} else if (!idAspirante.equals(other.idAspirante))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
