/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package java8.suppiler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Sep 6, 2016  
 */
public class Java8SupplierExample1 {

    public static void main(String[] args) {
        List<Student> studentList = createStudentList();
        Stream<String> names = studentList.stream().map(Student::getName);
        names.forEach(n -> System.out.println(n));
    }

    public static List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<Student>();
        Student s1 = new Student(1, "Arpit", "M", 19);
        Student s2 = new Student(2, "John", "M", 17);
        Student s3 = new Student(3, "Mary", "F", 14);
        Student s4 = new Student(4, "Martin", "M", 21);
        Student s5 = new Student(5, "Monica", "F", 16);
        Student s6 = new Student(6, "Ally", "F", 20);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        return studentList;
    }

}
