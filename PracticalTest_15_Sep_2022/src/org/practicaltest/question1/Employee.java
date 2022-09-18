package org.practicaltest.question1;

import java.util.Objects;

public class Employee {
	private int employeeid;
	private String employeename;
	private String employeeJoiningDate;
	public Employee(int employeeid, String employeename, String employeeJoiningDate) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeeJoiningDate = employeeJoiningDate;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}
	public void setEmployeeJoiningDate(String employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}

	
}
