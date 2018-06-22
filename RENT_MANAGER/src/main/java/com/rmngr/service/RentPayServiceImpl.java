package com.rmngr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmngr.bean.Rent_Payment;
import com.rmngr.dao.RentPayDao;

@Service("rentPayService")
public class RentPayServiceImpl implements RentPayService{

	private RentPayDao rentPayDao;

	@Autowired
	public void setRentPayDao(RentPayDao rentPayDao) {
		this.rentPayDao = rentPayDao;
	}

	@Override
	public void addPayment(Rent_Payment rPayment) {
		rentPayDao.addPayment(rPayment);
	}

	@Override
	public void editPayment(Rent_Payment rPayment) {
		rentPayDao.editPayment(rPayment);

	}

	@Override
	public void deletePayment(int renterId) {
		rentPayDao.deletePayment(renterId);		
	}

	@Override
	public Rent_Payment find(int renterId,String date) {
		return rentPayDao.find(renterId,date);
	}

	@Override
	public List<Rent_Payment> findAllByID(int roomNo) {
		return rentPayDao.findAllByID(roomNo);
	}

	@Override
	public boolean isRentRecordExists(Rent_Payment rPayment) {
		return rentPayDao.isRentRecordExists(rPayment);
	}



}
