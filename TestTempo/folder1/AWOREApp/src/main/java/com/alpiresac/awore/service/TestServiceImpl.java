package com.alpiresac.awore.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alpiresac.awore.domain.Tplan;
import com.alpiresac.awore.persistence.TplanMapper;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TplanMapper tplanMapper;
	
	@Transactional
	public void insertPlan(){
		Tplan plan = new Tplan();
		plan.setCodiPlan("E0001");
		plan.setCostPlan(25L);
		plan.setDescPlan("Descripcion...");
		
		System.out.println(tplanMapper.insert(plan));
	}
	
	public TestServiceImpl() {
		System.out.println("Load TestServiceImpl.java");
	}
	
}
