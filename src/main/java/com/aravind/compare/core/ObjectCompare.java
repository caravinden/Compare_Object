/**
 * 
 */
package com.aravind.compare.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.aravind.compare.dataobject.Employee;

/**
 * Class that helps to perform object comparison activity
 * @author aravind
 *
 */
public final class ObjectCompare {
	/**
	 * private constructor
	 */
	private ObjectCompare(){
		
	}
	/**
	 * It helps to sort object based on specified condition
	 * use compareTo method to perform this activity 
	 * @param employees
	 * @return
	 */
	public static List<Employee> compareObj(List<Employee> employees){
		System.out.println("Before sort::"+employees.toString());
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
		});
		
		for(Iterator<Employee> iter = employees.iterator(); iter.hasNext();){
		Employee employee = iter.next();
		System.out.println("After sort::"+employee.toString());
		}
		return employees;
	}
}

