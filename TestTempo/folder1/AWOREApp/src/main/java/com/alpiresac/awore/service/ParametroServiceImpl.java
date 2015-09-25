package com.alpiresac.awore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpiresac.awore.persistence.TparametriaMapper;

@Service
public class ParametroServiceImpl implements ParametroService {

	@Autowired
	private TparametriaMapper tparametriaMapper;
	
	
}
