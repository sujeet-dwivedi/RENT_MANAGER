package com.rmngr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rmngr.bean.Renter;

@Repository
@Qualifier("renterDao")
public class RenterDaoImpl implements RenterDao{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addRenter(Renter renter) {
		jdbcTemplate.update("INSERT INTO renter_details VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?)",
				renter.getRenterId(),renter.getFirstName(),renter.getLastName(),renter.getEmailId(),renter.getDob(),renter.getAadhaarNo(),renter.getPhone(),renter.getAddress(),renter.getPincode(),renter.getCity(),renter.getState());
		System.out.println("Renter Saved!!");
	}

	@Override
	public void editRenter(Renter renter, int renterId) {
		jdbcTemplate.update("UPDATE renter_details SET firstname = ? , lastname = ? , emailid = ? , dob = ? , aadhaarno = ? , phone = ? , address = ? , pincode = ? , city = ? , state = ? WHERE renterid = ? ",
				renter.getFirstName(),renter.getLastName(),renter.getEmailId(),renter.getDob(),renter.getAadhaarNo(),renter.getPhone(),renter.getAddress(),renter.getPincode(),renter.getCity(),renter.getState(), renterId);
		System.out.println("Renter Updated!!");

	}

	@Override
	public void deleteRenter(int renterId) {
		jdbcTemplate.update("DELETE from renter_details WHERE renterId = ? ", renterId);
		System.out.println("Renter Deleted!!");
	}

	@Override
	public Renter find(int renterId) {
		Renter renter = (Renter) jdbcTemplate.queryForObject("SELECT * FROM renter_details where renterId = ? ",
				new Object[] { renterId }, new BeanPropertyRowMapper(Renter.class));
		return renter;
	}

	@Override
	public List<Renter> findAll() {
		List < Renter > renter = jdbcTemplate.query("SELECT * FROM renter_details", new BeanPropertyRowMapper(Renter.class));
		return renter;
	}

	@Override
	public boolean isRoomExists(int renterId) {

		String sql = "SELECT count(*) FROM renter_details WHERE renterId = ?";
		boolean result = false;

		int count = jdbcTemplate.queryForObject(
				sql, new Object[] { renterId }, Integer.class);

		if (count > 0) {
			result = true;
		}

		return result;
	}

}
