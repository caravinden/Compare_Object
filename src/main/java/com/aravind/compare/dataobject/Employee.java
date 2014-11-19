/**
 * 
 */
package com.aravind.compare.dataobject;

/**
 * @author aravind
 *
 */
public class Employee {

	private int empID;
	private String empName;
	private String dept;
	private double salary;
	
	public Employee(){
		
	}
	
	
	public Employee(int empID, String empName, String dept, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp ID::"+empID+"--Emp Name::"+empName+"--Dept::"+dept+"--Salary::"+salary;
	}


	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
