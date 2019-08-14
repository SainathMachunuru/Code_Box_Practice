package com.myutil.collections;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double sal;
	private String address;

	public Employee(int id, String name, double sal, String address) {

		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
	/**
	 * Using comparable we can sort using one filed(generally by id i.e natural sorting)
	 * But we can also sort using multiple fields at a time by conditional statements
	 */
	@Override
	public int compareTo(Employee emp) {
		/*int result = Integer.compare(this.id, emp.id);
		if (result == 0) {
			result = Double.compare(this.sal,emp.sal);
		} 
		if (result == 0) {
			result = this.name.compareTo(emp.name);
		}
		return result;*/
		return this.id - emp.id;
		
	}
	public boolean equals(){
		return false;
		
	}

}
