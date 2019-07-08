package com.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.model.Employee;

/**
 *  RowMapper(I)  --> This interface is used to map resultset rows into model class object.  It is having one method mapRow() .
 * 		
 * 					<model class object> mapRow(ResultSet , rowNum) 		
 * 	
 * 		Since there is only one method so we can use lambda expression also , then no  need to write this class.
 * 
 * 				
 * **/


public class MyRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee e = new Employee();
		e.setEmpId(rs.getInt("id"));
		e.setEmpName(rs.getString("name"));
		e.setEmpGen(rs.getString("gen"));
		e.setEmpAge(rs.getInt("age"));
		e.setEmpAddr(rs.getString("address"));
		
		return e;
	}

}
