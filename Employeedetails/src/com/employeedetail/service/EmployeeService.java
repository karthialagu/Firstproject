package com.employeedetail.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employeedetail.model.Employee;
import com.employeedetail.util.DBConnectUtil;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class EmployeeService {

	public String addEmployee()throws ClassNotFoundException,SQLException {
		String msg="";
		Employee e=new Employee();
		Connection connect = DBConnectUtil.getDBConnection();
		String sqlQuery ="Insert Into employee (id, name, city, salary, gender, age)values(?,?,?,?,?)";
		PreparedStatement ps = connect.prepareStatement(sqlQuery);
		ps.setInt(1,1);
		ps.setString(2,"raja");
		ps.setString(3, "chennai");
		ps.setInt(4,25000);
		ps.setString(5,"male");
		ps.setInt(6,22);
		int i= ps.executeUpdate();
		if(i>0) {
			msg="updated successfully";
		}
		else {
			msg="not updated";
		}
        return msg;		
	}
}
