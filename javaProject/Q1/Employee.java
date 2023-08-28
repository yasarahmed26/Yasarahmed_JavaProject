package com.javaProject.Q1;

import java.io.Serializable;

public class Employee implements Serializable {
	private String employeeId;
	private String employeeName;
	private String phoneNumber;
	private String address;
	private int salary;

	public Employee(String employeeId, String employeeName, String phoneNumber, String address, int salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone="
				+ phoneNumber + ", employeeAddress=" + address + ", employeeSalary=" + salary + "]";
	}
}