package com.rmngr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmngr.bean.Renter;
import com.rmngr.dao.RenterDao;

@Service("renterService")
public class RenterServiceImpl implements RenterService{

	private RenterDao renterDao; 
	
	@Autowired
	public void setRenterDao(RenterDao renterDao) {
		this.renterDao = renterDao;
	}	
	
	@Override
	public void addRenter(Renter renter) {
		renterDao.addRenter(renter);
		
	}

	@Override
	public void editRenter(Renter renter, int renterId) {
		renterDao.editRenter(renter, renterId);
		
	}

	@Override
	public void deleteRenter(int renterId) {
		renterDao.deleteRenter(renterId);
		
	}

	@Override
	public Renter find(int renterId) {
		return renterDao.find(renterId);
	}

	@Override
	public List<Renter> findAll() {
		return renterDao.findAll();
	}

	@Override
	public boolean isRoomExists(int renterId) {
		return renterDao.isRoomExists(renterId);
	}

}
