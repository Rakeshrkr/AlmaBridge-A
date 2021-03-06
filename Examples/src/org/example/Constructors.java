package org.example;

public class Constructors {

	int employeeId ;
	String employeeName ;
	String employeeDepartment ;
	int employeeAge ;
	float employeeSalary ;
	

	public Constructors(int employeeId, String employeeName, String employeeDepartment, int employeeAge,
			float employeeSalary) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
	}
	
	public Constructors() {
		
	}
	
	

	public Constructors(int employeeId, String employeeName, String employeeDepartment, float employeeSalary) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
	}
	
	

	public Constructors(int employeeId, String employeeName, float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
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
		Constructors e1 = new Constructors(123, "Rakesh", "Software", 23, 800000);
		e1.display();
		System.out.println("-------");
		
		Constructors e2 = new Constructors();
		e2.display();
		System.out.println("-------");

		Constructors e3 = new Constructors(123, "Mahesh", "Software", 800000);
		e3.display();
		System.out.println("-------");
		
		Constructors e4 = new Constructors(123, "Aahna",  800000);
		e4.display();
		System.out.println("-------");
	}
}
