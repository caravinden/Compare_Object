/**
 * 
 */
package com.aravind.compare.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.aravind.compare.dataobject.Employee;

/**
 * Class that helps to perform object comparison activity
 * 
 * @author aravind
 *
 */
public final class ObjectCompare {
	
	private static final Logger LOG = Logger.getLogger(ObjectCompare.class);
	/**
	 * private constructor
	 */
	private ObjectCompare() {

	}

	/**
	 * Natural sorting of employee pojo based on employee name it uses compareTo
	 * functions
	 * 
	 * @param eList
	 */
	public static void comparable(List<Employee> eList) {
		LOG.info("\n-------------------------------------\nBefore sort::"
						+ eList.toString());

		Collections.sort(eList);

		LOG.info("\n-------------------------------------\nAfter sort::"
						+ eList.toString());
	}

	/**
	 * To sort integer numbers using comparator interface it uses compare
	 * function
	 * 
	 * @param numbers
	 */
	public static void comparator(List<Integer> numbers) {
		LOG.info("\n-------------------------------------\nBefore sort::"
						+ numbers.toString());
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		LOG.info("\n-------------------------------------\nAfter sort::"
						+ numbers.toString());
	}

	/**
	 * It helps to sort object based on specified condition use compareTo method
	 * to perform this activity
	 * 
	 * @param employees
	 * @return
	 */
	public static List<Employee> compareObj(List<Employee> employees) {
		LOG.info("\n-------------------------------------\nBefore sort::" + employees.toString());
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
		});

		for (Iterator<Employee> iter = employees.iterator(); iter.hasNext();) {
			Employee employee = iter.next();
			LOG.info("\n-------------------------------------\nAfter sort::" + employee.toString());
		}
		return employees;
	}
}
