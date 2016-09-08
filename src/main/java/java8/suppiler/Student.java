/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package java8.suppiler;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Sep 6, 2016  
 */
public class Student {

    private int id;

    private String name;

    private String gender;

    private int age;

    public Student(int id, String name, String gender, int age) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
    }

}