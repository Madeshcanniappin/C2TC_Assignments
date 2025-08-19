package com.Madesh.Assignments.one.Utilities;

import com.Madesh.Assignments.one.Employees.Developer;
import com.Madesh.Assignments.one.Employees.Employee;
import com.Madesh.Assignments.one.Employees.Manager;

public class EmployeeUtilities {

	
	public void getEmpInfo(Employee emp)
	{
		System.out.println("Employee Name: "+ emp.getName());
		System.out.println("Employee ID: "+ emp.getEmpID());
		System.out.println("Employee"+ emp.getSalary());	
	}
	
	public void getManagerInfo(Manager man)
	{
		getEmpInfo(man);
		System.out.println("Department: "+ man.getDept());
	
	}
	
	public void getDeveloperInfo(Developer dev)
	{
		getEmpInfo(dev);
		System.out.println("Programming Language: "+ dev.getLang());
	}
	
	public void giveRaise(Employee emp,Double amount)
	{
		emp.setSalary(emp.getSalary()+amount);
	}
	
}
