package com.Madesh.Assignments.one.Employees;

public class Employee {

	
		// TODO Auto-generated method stub
        private String name;
        private int empID;
        private double salary;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmpID() {
			return empID;
		}
		public void setEmpID(int empID) {
			this.empID = empID;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double d) {
			this.salary = d;
		}
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", empID=" + empID + ", salary=" + salary + "]";
		}
        
        
        
        
	

}
