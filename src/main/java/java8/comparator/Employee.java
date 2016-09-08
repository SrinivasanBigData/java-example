/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package java8.comparator;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Aug 30, 2016  
 */
public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
     
    public Employee(int id, String firstName, String lastName, int age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
     
    //Other getter and setter methods
    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "\n["+this.id+","+this.firstName+","+this.lastName+","+this.age+"]"; 
    }
}