package com.Assignment2b;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args){
        //
        Shape[] ShapeArray = {new Rectangle(2,3), new Circle(6)};
        System.out.println("The area of a rectangle is: "+ ShapeArray[0].calculateArea());
        System.out.println("The area of a circle is: "+ ShapeArray[1].calculateArea());


        BankAccount acc = new BankAccount();
        acc.setAccountNumber(1234);
        System.out.println("Account Number is: "+ acc.getAccountNumber());
        acc.setBalance(5000);
        System.out.println("The balance is: "+ acc.getBalance());
        acc.setCustomerName("R Singh");
        System.out.println("Customer Name is: "+ acc.getCustomerName());


        Person per = new Person();
        per.setName("Anish Bhat");
        System.out.println("Name: "+ per.getName());
        per.setAge(16);
        System.out.println("Age: "+ per.getAge());
        per.setAddress("ABC Street");
        System.out.println("Address: "+ per.getAddress());

        Employee emp = new Employee();
        emp.setName("Ashwini Kularni");
        System.out.println("Employee name: " + emp.getName());
        emp.setSalary(100000);
        System.out.println("Employee name: " + emp.getSalary());
        emp.setHireDate(new Date(2019 - 1900, 11, 16));
        System.out.println("Employee name: " + emp.getHireDate());

        Book book1 = new Book();
        book1.setTitle("Man's search for meaning");
        System.out.println("Title: "+ book1.getTitle());
        book1.setAuthor("Victor E Frankl");
        System.out.println("Author: "+ book1.getAuthor());
        book1.setIsbn("978-1416524281");
        System.out.println("ISBN: "+ book1.getIsbn());
        book1.setPrice(700);
        System.out.println("Price: "+ book1.getPrice());

        House house1 = new House();
        house1.setAddress("1234 street");
        System.out.println("Address : " + house1.getAddress());
        house1.setSquareFootage(1750);
        System.out.println("Area : " + house1.getSquareFootage());
        house1.setNumRooms(5);
        System.out.println("Number of rooms : " + house1.getNumRooms());
    }



}
