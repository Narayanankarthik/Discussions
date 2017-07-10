package com.basics.clazz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
public class MainCollection {
	
	private static Comparator<Employee> EMP_ID = new Comparator<Employee>() {

		public int compare(Employee o1, Employee o2) {
			
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
	};
	public static void main(String[] arg){
		Employee  e1 = new Employee(1, "X1", "L1", new Date());
		Employee  e2 = new Employee(2, "A2", "L1", new Date());
		Employee  e3 = new Employee(3, "F3", "L1", new Date());
		Employee  e4 = new Employee(4, "C4", "L1", new Date());
		Employee  e5 = new Employee(5, "R5", "L1", new Date());
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e3);
		employees.add(e4);
		employees.add(e1);
		employees.add(e2);	
		employees.add(e5);
		Employee find = new Employee(4,null, null, null);
		
		int index = employees.indexOf(find);
		System.out.println(index );
		if (index != -1)	{
			System.out.println(employees.get(index) );
		}
		
		System.out.println(employees);
		
		Collections.sort(employees);
		System.out.println(employees);
		

		Collections.sort(employees, EMP_ID);
		System.out.println(employees);
		
		
	}
}



class Employee implements Comparable<Employee> {
	private int id;
	private String firstName;
	private String lastName;
	private Date dob;

	public Employee(int id, String firstName, String lastName, Date dob) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}

	public int compareTo(Employee o) {
		if (this == o)
			return 0;
		if (o == null)
			return -1;

		return id - o.id ;
	}
}
