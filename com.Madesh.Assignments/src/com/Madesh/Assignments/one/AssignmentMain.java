package com.Madesh.Assignments.one;

import com.Madesh.Assignments.one.Employees.Developer;
import com.Madesh.Assignments.one.Employees.Employee;
import com.Madesh.Assignments.one.Employees.Manager;
import com.Madesh.Assignments.one.Utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Manager m=new Manager();
    
    m.setDept("AI");
    m.setEmpID(22);
    m.setName("Madesh");
    m.setSalary(40000);
    
    Developer d=new Developer();
    d.setEmpID(23);
    d.setLang("JAVA");
    d.setName("Rajini");
    d.setSalary(60000);
    
    EmployeeUtilities eu=new EmployeeUtilities();
    
    //Manager details
    System.out.println("Manager Information \n" );
    eu.getManagerInfo(m);
    
    System.out.println("Developer Information");
    eu.getDeveloperInfo(d);
    
    
    
	}

}
