/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package java8.suppiler;

import java.util.function.Supplier;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Sep 6, 2016  
 */
public class Java8SupplierExample {

    public static void main(String[] args) {
        Supplier<String> supplier=()->"Arpit"; 
        System.out.println(supplier.get());
        
    }
}
