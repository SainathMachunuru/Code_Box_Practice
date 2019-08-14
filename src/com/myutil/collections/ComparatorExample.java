package com.myutil.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
	public static void main(String[] args) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		temp.add(new Employee(4, "sai", 1000, "hyd"));
		temp.add(new Employee(1, "pari", 2000, "chn"));
		temp.add(new Employee(2, "raju", 6000, "bnlr"));
		temp.add(new Employee(3, "niha", 4000, "pune"));
		temp.add(new Employee(2, "raju", 6000, "del"));

		//Collections.sort(temp, new EmpSalaryComparator());
		Collections.sort(temp, new EmpNameComparator());

		for (Employee emp : temp) {
			System.out.println(emp.toString());

		}
	}

}
