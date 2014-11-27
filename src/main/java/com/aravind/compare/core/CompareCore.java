/**
 * 
 */
package com.aravind.compare.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aravind.compare.dataobject.Employee;

/**
 * Class that used to make object comparison
 * 
 * @author aravind
 *
 */
public class CompareCore {

	/**
	 * main function to initialize compareObj function
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		ObjectCompare.compareObj(Arrays.asList(new Employee(1, "sreekanth",
				"it", 4), new Employee(1, "aravind", "java", 3),
				new Employee(1, "jinesh", "cs", 6), new Employee(1,
						"abilash", "product", 2)));
		
		Employee employee = new Employee();
		employee.setEmpID(1);
		employee.setDept("IT");
		employee.setSalary(2000);
		employee.setEmpName("zpage");
		
		Employee employee1 = new Employee();
		employee1.setEmpID(2);
		employee1.setDept("IT");
		employee1.setSalary(3000);
		employee1.setEmpName("tpage");
		
		employees.add(employee);
		employees.add(employee1);
		/*
		 * Using Comparable interface and compareTo() function
		 */
		ObjectCompare.comparable(employees);
		
		/**
		 * Using Comparator interface and compare() function
		 */
		ObjectCompare.comparator(Arrays.asList(15,73,74,10,56,34,87,27));
		
	}

}
