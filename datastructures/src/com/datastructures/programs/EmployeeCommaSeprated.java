package com.datastructures.programs;

class Employee {
	private int id;
	private String name;
	private int age;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "," + name + "," + age;
	}
}

public class EmployeeCommaSeprated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee(10, "vishal", 27);
		System.out.println(e);
	}

}
