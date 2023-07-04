package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static List<Employee> findListEmployee() {
		List<Employee> employees = Arrays.asList(new Employee(3, "Obaid", 10000.0),
				new Employee(2, "Shabbu", 20000.0), new Employee(1, "Alam", 30000.0),
				new Employee(4, "Hareem", 40000.0));
		System.out.println("size of employee list " + employees.size());

		/*
		 * second way to add the data into employee list List<Employee> employees2 = new
		 * ArrayList<>(); employees2.add(new Employee(5,"shabbu",500000.0));
		 */
		return employees;
	}

	public static Map<Employee, Integer> findMapEmployee() {
		Map<Employee, Integer> employeeMap = new HashMap<>();
		employeeMap.put(new Employee(3, "Obaid", 10000.0), 8111);
		employeeMap.put(new Employee(2, "Shabbu", 20000.0), 8112);
		employeeMap.put(new Employee(1, "Alam", 30000.0), 8113);
		employeeMap.put(new Employee(4, "Hareem", 40000.0), 8114);
		return employeeMap;
	}

	public static void main(String[] args) {
		EmployeeMain.findListEmployee().forEach(System.out::println);
		System.out.println(EmployeeMain.findMapEmployee());
		List<Employee> findListEmployee = EmployeeMain.findListEmployee();
		Map<Integer, Employee> map = findListEmployee.stream()
				.collect(Collectors.toMap(Employee::getId, Function.identity()));
		map.forEach((key,value)->System.out.println(key+" "+value));
		System.err.println("+++++++++++++++++++++++++++++++++++");
		Map<Integer, String> map1=findListEmployee.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
	     for(Map.Entry<Integer, String> mapEntry : map1.entrySet()) {
	    	 System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
	     }
	}
	
}
