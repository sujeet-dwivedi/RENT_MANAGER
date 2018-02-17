package com.rmngr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rmngr.bean.Renter;
import com.rmngr.bean.User;

@Repository
@Qualifier("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addUser(User user) {
		jdbcTemplate.update("INSERT INTO user_registration VALUES (auto_encrement.NEXTVAL,?,?,?,?,?,?,?)",
				user.getFirstName(),user.getLastName(),user.getEmailId(),user.getPhone(),user.getUserName(),user.getPassword(),user.getRePassword());
		System.out.println("User Saved!!");

	}

	@Override
	public void editUser(User user, int userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public User find(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/*	@Override
	public User validateUser(User user) {
		user = (User) jdbcTemplate.queryForObject("SELECT * FROM user_registration where username = ? and password = ?",
				new Object[] { user.getUserName(),user.getPassword() }, new BeanPropertyRowMapper(User.class));
		System.out.println("User validated !!");
		return user;
	}
	 */

	@Override
	public boolean validateUser(User user) {
		String sql = "SELECT count(*) FROM user_registration where username = ? and password = ?";
		boolean result = false;
		int count = jdbcTemplate.queryForObject(
				sql, new Object[] { user.getUserName(),user.getPassword() }, Integer.class);
		if (count > 0) {
			result = true;
		}
		return result;
	}

}
