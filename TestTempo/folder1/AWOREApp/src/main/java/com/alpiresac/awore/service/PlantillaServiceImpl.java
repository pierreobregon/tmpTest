package com.alpiresac.awore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpiresac.awore.domain.Timagenrepo;
import com.alpiresac.awore.domain.Tplantilla;
import com.alpiresac.awore.domain.Ttipoplantilla;
import com.alpiresac.awore.persistence.TplantillaMapper;
import com.alpiresac.awore.persistence.TtipoplantillaMapper;
import com.alpiresac.awore.util.Constantes;

@Service
public class PlantillaServiceImpl implements PlantillaService {

	@Autowired
	private TplantillaMapper tplantillaMapper;
	
	@Autowired
	private TtipoplantillaMapper ttipoplantillaMapper;
	
	@Autowired
	private ImagenRepoService imagenRepoService;
	
	
	public List<Tplantilla> obtenerPlantillasXTipo(String strCodTipoPlantilla) {
		Tplantilla bean = new Tplantilla();
		bean.setCodiTipoPlantilla(strCodTipoPlantilla);
		bean.setEstado(Constantes.estado.ACTIVO);
		List<Tplantilla> lstResult =  tplantillaMapper.selectByTipo(bean);
		for (Tplantilla tplantilla : lstResult) {
			tplantilla.setLstImages(imagenRepoService.obtenerImagenXIdPlantilla(tplantilla.getId()));
			tplantilla.setImageSelect((tplantilla.getLstImages()!=null &&tplantilla.getLstImages().size()>0)?tplantilla.getLstImages().get(0):new Timagenrepo());
		}
		return lstResult;
	}

	public List<Ttipoplantilla> obtenerTiposPlantillas() {
		return ttipoplantillaMapper.selectAll();
	}

}
