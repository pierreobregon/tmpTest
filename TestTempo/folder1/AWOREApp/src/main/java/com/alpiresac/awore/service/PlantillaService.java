package com.alpiresac.awore.service;

import java.util.List;

import com.alpiresac.awore.domain.Tplantilla;
import com.alpiresac.awore.domain.Ttipoplantilla;

public interface PlantillaService {

	public List<Tplantilla> obtenerPlantillasXTipo(String strCodTipoPlantilla);
	public List<Ttipoplantilla> obtenerTiposPlantillas();
}
