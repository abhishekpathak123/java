package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.FRSBean;
import com.capgemini.dao.IFRSDao;

@Service
public class FRSService implements IFRSService {

	@Autowired
	IFRSDao frsdao;
	
	
	
	
	
	public IFRSDao getFrsdao() {
		return frsdao;
	}





	public void setFrsdao(IFRSDao frsdao) {
		this.frsdao = frsdao;
	}





	@Override
	public FRSBean addFlat(FRSBean frsbean) {
		// TODO Auto-generated method stub
		return frsdao.addFlat(frsbean);
	}

}
