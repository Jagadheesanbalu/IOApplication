/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jagadheesan Balu
 */
public class CompareMainClass {
    
    public static void main(String arg[]) {
        
        Employee e1 = new Employee(1,"AAA",10);
        Employee e2 = new Employee(2,"BBB",50);
        Employee e3 = new Employee(2,"CCC",25);
        Employee e4 = new Employee(2,"DDD",125);
        Employee e5 = new Employee(2,"EEE",45);
        
        List<Employee> list = new ArrayList<Employee>();
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        
        Comparator<Employee> com = new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                
                return o1.salary > o2.salary ? 1 : (o1.salary < o2.salary ? -1 : 0);
                
            }
        };
        
        for(Employee e:list) 
        System.out.println("bfr"+e.getName());
        
        Collections.sort(list, com);
        
        for(Employee e:list)
        System.out.println("aftr"+e.getName());
       
        
        
    }
    
}
