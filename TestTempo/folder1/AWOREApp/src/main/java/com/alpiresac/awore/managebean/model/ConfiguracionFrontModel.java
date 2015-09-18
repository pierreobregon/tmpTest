package com.alpiresac.awore.managebean.model;

import java.util.List;

import com.alpiresac.awore.domain.Tcontenido;
import com.alpiresac.awore.domain.Tcuenta;
import com.alpiresac.awore.domain.Tplantilla;

public class ConfiguracionFrontModel extends GenericModel{
	private static final long serialVersionUID = 1L;
	
	private List<Tplantilla> lstPlantilla;
	private List<Tcontenido> lstContenido;
	private List<Tcuenta> lstCuentas;
	private Integer intIndexStep;

	public List<Tplantilla> getLstPlantilla() {
		return lstPlantilla;
	}

	public void setLstPlantilla(List<Tplantilla> lstPlantilla) {
		this.lstPlantilla = lstPlantilla;
	}

	public Integer getIntIndexStep() {
		return intIndexStep;
	}

	public void setIntIndexStep(Integer intIndexStep) {
		this.intIndexStep = intIndexStep;
	}

	public List<Tcontenido> getLstContenido() {
		return lstContenido;
	}

	public void setLstContenido(List<Tcontenido> lstContenido) {
		this.lstContenido = lstContenido;
	}

	public List<Tcuenta> getLstCuentas() {
		return lstCuentas;
	}

	public void setLstCuentas(List<Tcuenta> lstCuentas) {
		this.lstCuentas = lstCuentas;
	}
	
	
	
}
