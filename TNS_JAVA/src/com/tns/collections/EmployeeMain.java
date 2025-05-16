package com.tns.collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain{
	
	static void printEmployees(List<Employee> employees) {
		for(Employee e:employees) {
			System.out.println("Name: "+e.ename +" ID: "+e.eid +" Salary: "+e.sal);
		}
	}
	
	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(100,"Alphones",100000));
		employees.add(new Employee(101,"Abhishek",100000));
		employees.add(new Employee(102,"Rushitha",110000));
		employees.add(new Employee(103,"Shashi",100000));
		
		System.out.println("Sorting by Names:");
		Collections.sort(employees,new EnameCompare());
		printEmployees(employees);

		System.out.println("Sorting by Salaries: ");
		Collections.sort(employees,new EsalCompare());
		printEmployees(employees);
		
	}
	
}