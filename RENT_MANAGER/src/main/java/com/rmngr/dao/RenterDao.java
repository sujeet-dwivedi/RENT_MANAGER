package com.rmngr.dao;

import java.util.List;

import com.rmngr.bean.Renter;

public interface RenterDao {

	public void addRenter(Renter renter);

	public void editRenter(Renter renter, int renterId);

	public void deleteRenter(int renterId);

	public Renter find(int renterId);

	public List < Renter > findAll();
}
