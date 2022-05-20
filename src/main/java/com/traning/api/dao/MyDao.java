package com.traning.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.traning.api.Employee;

@Repository
public class MyDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Employee> findAll() {
		 return jdbcTemplate.query("select * from Employee", new EmployeeRowMapper());
	}
	public void save(Employee employee) {
		jdbcTemplate.update("INSERT INTO Employee (id, name, age, mobileNumber, datetime) VALUES (?,?,?,?,?)", new Object[] {employee.getId(),employee.getName(),employee.getAge(),employee.getMobileNumber(),employee.getDatetime()});
	}
	public void delete(Integer id) {
		jdbcTemplate.update("delete from Employee where id=?",new Object[] {id});
	}
	public void update(Employee employee) {
		jdbcTemplate.update("update Employee set name=?, age=?, mobileNumber=?, datetime=? where id = ?", new Object[] {employee.getName(),employee.getAge(),employee.getMobileNumber(),employee.getDatetime(),employee.getId()});
	}
	public Employee findByID(Integer id) {
		return jdbcTemplate.queryForObject("select * from Employee where id=?", new Object[] {id},new EmployeeRowMapper());
	}
	class EmployeeRowMapper implements RowMapper<Employee>{
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setId(rs.getInt("id"));
			employee.setName(rs.getString("name"));
			employee.setAge(rs.getString("age"));
			employee.setMobileNumber(rs.getString("mobileNumber"));
			employee.setDatetime(rs.getTimestamp("datetime"));
			return employee;
		}
	}
	
		
}
