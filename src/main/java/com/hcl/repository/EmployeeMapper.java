package com.hcl.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.beans.Employee;


public class EmployeeMapper implements RowMapper<Employee> {
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setCity(rs.getString(3));
		return e;
	}

}
