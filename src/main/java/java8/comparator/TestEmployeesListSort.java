/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package java8.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Aug 30, 2016  
 */
public class TestEmployeesListSort {
    private static List<Employee> getEmployees() {
        List<Employee> employees  = new ArrayList<>();
        employees.add(new Employee(1,"Lokesh", "Gupta", 32));
        employees.add(new Employee(2,"Aman", "Sharma", 28));
        employees.add(new Employee(3,"Aakash", "Yaadav", 52));
        employees.add(new Employee(4,"James", "Hedge", 72));
        employees.add(new Employee(5,"David", "Kameron", 19));
        employees.add(new Employee(6,"Yash", "Chopra", 25));
        employees.add(new Employee(7,"Karan", "Johar", 59));
        employees.add(new Employee(8,"Balaji", "Subbu", 88));
        employees.add(new Employee(9,"Vishu", "Bissi", 33));
        employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
        return employees;
    }

    public static void main(String[] args) {
     
        System.out.println("Sort all employees by first name===================");
        
        List<Employee> employees  = getEmployees();
        
        //Sort all employees by first name
        employees.sort(Comparator.comparing(e -> e.getFirstName()));
         
        //OR you can use below
        employees.sort(Comparator.comparing(Employee::getFirstName));
         
        //Let's print the sorted list
        System.out.println(employees);
        
        System.out.println("Sort all employees by first name in reverse order===================");
        
        //Sort all employees by first name; And then reversed
        Comparator<Employee> comparator = Comparator.comparing(e -> e.getFirstName());
        employees.sort(comparator.reversed());
         
        //Let's print the sorted list
        System.out.println(employees);
        
        System.out.println("Sort all employees by last name===================");
        
        //Sort all employees by first name
        employees.sort(Comparator.comparing(e -> e.getLastName()));
         
        //OR you can use below
        employees.sort(Comparator.comparing(Employee::getLastName));
         
        //Let's print the sorted list
        System.out.println(employees);
        
        System.out.println("Sort By first name and then by last name===================");
        
        //Sorting on multiple fields; Group by.
        Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
                                                            .thenComparing(Employee::getLastName);
        employees.sort(groupByComparator);
         
        System.out.println(employees);
        
        System.out.println("Using parallel sorting (with multiple threads)===================");
        
      //Parallel Sorting
        Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);
         
        //Parallel sorting
        Arrays.parallelSort(employeesArray, groupByComparator);
         
        System.out.println(employeesArray);
        
    }
}
