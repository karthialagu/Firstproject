package com.employeemain;

import java.sql.SQLException;

import com.employeedetail.service.EmployeeService;

public class Employeemain {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	EmployeeService es=new EmployeeService();
	String a = es.addEmployee();
	System.out.println(a);
}

		
			
			
			
		

	


}
