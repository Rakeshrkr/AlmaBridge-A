package org.example;

public class Student {
	int rollNo ;
	String Name ;
	float marks ;
	

	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Rakesh");
		s.setRollNo(120260015);
		s.setMarks(70);
		
		System.out.println("Name of the student is :-" + s.getName());
		System.out.println("Roll No of the student is :-" + s.getRollNo());
		System.out.println("Marks of the student is :-" + s.getMarks());

	}

}
