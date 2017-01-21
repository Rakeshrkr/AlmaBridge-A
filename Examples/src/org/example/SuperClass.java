package org.example;

abstract public class SuperClass {
	int employeeId ;
	String employeeName ;
	String employeeDepartment ;
	
	
	
	public SuperClass(int employeeId, String employeeName, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
	}



	public  void display(){
		System.out.println("Name of the employee is :-" + employeeName);
		System.out.println("Id of the employee is :-" + employeeId);
		System.out.println("Department of the employee is :-" + employeeDepartment);
		
	}
}
