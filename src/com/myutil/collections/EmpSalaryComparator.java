package com.myutil.collections;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return (int) (emp1.getSal() - emp2.getSal());
	}

}
