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
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();

		ObjectCompare.compareObj(Arrays.asList(new Employee(1, "sreekanth",
				"it", 4), new Employee(1, "aravind", "java", 3),
				new Employee(1, "jinesh", "cs", 6), new Employee(1,
						"abilash", "product", 2)));
	}

}
