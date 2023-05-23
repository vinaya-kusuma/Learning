package com.assignment;



public class Demo1 {

    public static void main(String[] args){

        Rectangle rec = new Rectangle(10,5);

        System.out.println("the area of rectangle is:" + rec.getArea());

       SavingsAccount sa = new SavingsAccount();
        sa.balance = 100;
        sa.minBalance = 10;
        sa.withdraw(50);

       Car c = new Car();
        c.make = "Toyota";
        c.model = "Corolla";
        c.drive();

        Dog d = new Dog();
        d.eat();
        d.sleep();


        Employee emp = new Employee();
        emp.salary= 200;
        emp.lastName ="Lim";
        emp.firstName = "Tracy";
        System.out.println("The salary of " + emp.firstName + " "+emp.lastName + " is" + emp.getSalary());



    }
}
