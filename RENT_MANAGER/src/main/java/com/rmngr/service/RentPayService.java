package com.rmngr.service;

import java.util.List;

import com.rmngr.bean.Rent_Payment;

public interface RentPayService {
	
	public void addPayment(Rent_Payment rPayment);

	public void editPayment(Rent_Payment rPayment);

	public void deletePayment(int renterId);

	public Rent_Payment find(int renterId,String date);

	public List < Rent_Payment > findAllByID(int roomNo);
	
	public boolean isRentRecordExists(Rent_Payment rPayment);

}
