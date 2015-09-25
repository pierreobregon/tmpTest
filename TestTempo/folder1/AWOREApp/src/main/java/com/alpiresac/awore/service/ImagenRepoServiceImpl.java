package com.alpiresac.awore.service;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.log4j.Logger;
import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpiresac.awore.domain.Timagenrepo;
import com.alpiresac.awore.persistence.TimagenrepoMapper;

@Service
public class ImagenRepoServiceImpl implements ImagenRepoService {

	@Autowired
	private TimagenrepoMapper timagenrepoMapper;
	Logger logger = Logger.getLogger(ImagenRepoServiceImpl.class);
	
	public List<Timagenrepo> obtenerImagenXIdPlantilla(Integer idPlantilla) {
		List<Timagenrepo> lstImagRepo = timagenrepoMapper.selectByIdPlantilla(idPlantilla);
		
		
		for (Timagenrepo timagenrepo : lstImagRepo) {
			try {
				timagenrepo.setStreamedContentImage(
						this.getGraphicImage(
								timagenrepo.getRutaImag()
								));
			} catch (FileNotFoundException e) {
				logger.error(e);
			}
		}
		return lstImagRepo;
	}
	
	
	public StreamedContent getGraphicImage(String strRutaArchivo) throws FileNotFoundException {
	    return new org.primefaces.model.DefaultStreamedContent(
	        new FileInputStream(strRutaArchivo),"image/png","fancoil-pared.ice.png"
	    );
	}
	
	
}
