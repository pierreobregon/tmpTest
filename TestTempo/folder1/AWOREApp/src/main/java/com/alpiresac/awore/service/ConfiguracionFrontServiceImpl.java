package com.alpiresac.awore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpiresac.awore.persistence.TplantillaMapper;

@Service
public class ConfiguracionFrontServiceImpl implements ConfiguracionFrontService {

	@Autowired
	private TplantillaMapper tplantillaMapper;
	
}
