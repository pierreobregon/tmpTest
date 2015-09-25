package com.alpiresac.awore.service;

import java.util.List;

import com.alpiresac.awore.domain.Timagenrepo;

public interface ImagenRepoService {

	public List<Timagenrepo> obtenerImagenXIdPlantilla(Integer idPlantilla);
}
