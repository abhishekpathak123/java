package com.cg.trust.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trust.beans.DonorBean;
import com.cg.trust.dao.IDonorDao;
//step 1:service class will implements service interface&override all methods
//step 2:mark the service class with spring's @Service annotations
@Service
public class DonorService implements IDonorService
{
//step 3:create Dao interface type variable followed by getters &setters
//step 4:marks the variable with spring's @Autowired annotation
	@Autowired
	IDonorDao donorDao;	
	
	public IDonorDao getDonorDao() {
		return donorDao;
	}
	public void setDonorDao(IDonorDao donorDao) {
		this.donorDao = donorDao;
	}
	//step 5:In overriden methods invoke dao layer methods and return
	@Override
	public DonorBean addDonation(DonorBean donor) {
		//set todays date as donation date		
		donor.setDonationDate(new Date());
		return donorDao.addDonation(donor);
	}
	@Override
	public DonorBean getDonationDetails(int donorId) {
		return donorDao.getDonationDetails(donorId);
	}
	@Override
	public List<DonorBean> getAllDonorsDetails() {
		return donorDao.getAllDonorsDetails();
	}

	}
