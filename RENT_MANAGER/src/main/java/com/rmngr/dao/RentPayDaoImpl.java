package com.rmngr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rmngr.bean.Rent_Payment;
import com.rmngr.bean.Renter;

@Repository
@Qualifier("rentPayDao")
public class RentPayDaoImpl implements RentPayDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void addPayment(Rent_Payment rPayment) {
		jdbcTemplate.update("INSERT INTO rent_payment VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
				rPayment.getRoomno(),rPayment.getRentdate(),rPayment.getMeterfrom(),rPayment.getMetertill(),rPayment.getTotalunit(),rPayment.getElectricitybill(),rPayment.getRoomrent(),rPayment.getTotalamt());
		System.out.println("Rent Saved!!");		
	}

	@Override
	public void editPayment(Rent_Payment rPayment) {
		jdbcTemplate.update("UPDATE rent_payment SET meterfrom = ? , metertill = ? , totalunit = ? , electricitybill = ? , roomrent = ? , totalamt = ?  WHERE roomno = ? and rentdate = ? ",
				rPayment.getMeterfrom(),rPayment.getMetertill(),rPayment.getTotalunit(),rPayment.getElectricitybill(),rPayment.getRoomrent(),rPayment.getTotalamt(),rPayment.getRoomno(),rPayment.getRentdate());
		System.out.println("Rent Updated!!");
		
	}

	@Override
	public void deletePayment(int renterId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rent_Payment find(int renterId,String date) {
		Rent_Payment rPayment = (Rent_Payment) jdbcTemplate.queryForObject("SELECT * FROM rent_payment where roomno = ? and rentdate = ?",
				new Object[] { renterId,date}, new BeanPropertyRowMapper(Rent_Payment.class));
		return rPayment;
	}

	@Override
	public List<Rent_Payment> findAllByID(int roomNo) {
		List < Rent_Payment > rPayments = jdbcTemplate.query("SELECT * FROM rent_payment WHERE roomno ='"+roomNo+"'", new BeanPropertyRowMapper(Rent_Payment.class)); 
		return rPayments;
	}

	@Override
	public boolean isRentRecordExists(Rent_Payment rPayment) {
		String sql = "SELECT count(*) FROM rent_payment WHERE roomno = ? and rentdate = ?";
		boolean result = false;

		int count = jdbcTemplate.queryForObject(
				sql, new Object[] { rPayment.getRoomno(),rPayment.getRentdate() }, Integer.class);

		if (count > 0) {
			result = true;
		}

		return result;
	}
	

}
