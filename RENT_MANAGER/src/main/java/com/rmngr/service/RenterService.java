package com.rmngr.service;

import java.util.List;

import com.rmngr.bean.Renter;


public interface RenterService {

	public void addRenter(Renter renter);

	public void editRenter(Renter renter, int renterId);

	public void deleteRenter(int renterId);

	public Renter find(int renterId);

	public List < Renter > findAll();
	
	public boolean isRoomExists(int renterId);
}
