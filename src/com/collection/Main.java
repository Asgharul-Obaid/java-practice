package com.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> emplist = Arrays.asList(
                new Employee(1, "Aamir", 4400d),
                new Employee(2, "Asad", 4400d),
                new Employee(5, "Zaki", 3200d),
                new Employee(6, "Aamir", 4400d),
                new Employee(4, "Zaki", 3200d),
                new Employee(3, "Asad", 4400d)
        );
//        final int n = 2; 
//        Collections.sort(empList, new Comparator<Employee>() {
//        	
//            @Override
//            
//            public int compare(Employee e1, Employee e2) {
//                return Double.compare(e2.getSalary(), e1.getSalary());
//            }
//        });
//                if (n <= empList.size()) {
//            Employee e = empList.get(n - 1);
//            System.out.println("Employee Name: " + e.getName());
//            System.out.println("Salary: " + e.getSalary());
//        } else {
//            System.out.println(n);
//        }
        
        Optional<List<Employee>> maxSalary = emplist.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream().max(Comparator.comparingDouble(Map.Entry::getKey)).map(Map.Entry::getValue);
       
        List<Employee> employees = maxSalary.get();
        
        Double d = 0.0;
        ListIterator<Employee> iterator = employees.listIterator();
        while(iterator.hasNext()) {
        	Employee employee = iterator.next();
        	d = employee.getSalary();
        	System.out.println(employee.getName()+" "+ employee.getSalary());
        }
        
        
        	Employee employee1 = null;
        	for(int i = 0 ; i < emplist.size() ; i++) {
        		Double minDouble = emplist.get(i).getSalary();
        		if(d > minDouble) {
        			employee1 = emplist.get(i);
        		}
        	}
        	
    System.out.println(employee1.getName()+" "+employee1.getSalary());
        
    }
}
