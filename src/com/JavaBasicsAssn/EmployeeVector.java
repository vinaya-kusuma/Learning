package com.JavaBasicsAssn;

import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {
    public static void main(String[] args) {
        Vector<EmployeeDetails> employeeVector = new Vector<>();

        employeeVector.add(new EmployeeDetails(2,"Ashish","1234 street",120000));
        employeeVector.add(new EmployeeDetails(1,"Vanitha","1879 street",120000));

        Iterator iterator = employeeVector.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
        }

    }




