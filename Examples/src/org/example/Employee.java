package org.example;

public class Employee {
	int employeeId ;
	String employeeName ;
	String employeeDepartment ;
	int employeeAge ;
	float employeeSalary ;
	

	public Employee(int employeeId, String employeeName, String employeeDepartment, int employeeAge,
			float employeeSalary) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
	}
	public  void display(){
		System.out.println("Name of the employee is :-" + employeeName);
		System.out.println("Id of the employee is :-" + employeeId);
		System.out.println("Department of the employee is :-" + employeeDepartment);
		System.out.println("Age of the employee is :-" + employeeAge);
		System.out.println("Salary of the employee is :-" + employeeSalary);
	}

	public static void main(String[] args) {
		Employee e = new Employee(123, "Rakesh", "Software", 23, 800000);
		e.display();

	}

}
