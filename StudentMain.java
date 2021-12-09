package com.core.oops;

public class StudentMain {

	public static void main(String[] args) {
		// 1. To create an object
		Student student = new Student();

		// 2. Set property values
		student.setId(1);
		student.setName("Priyanka");
		student.setGender('F');

		// 3. Get prpoerty values
		int id = student.getId();
		String name = student.getName();
		char gender = student.getGender();

		// 4. Print property data in the console view

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
	}

}
