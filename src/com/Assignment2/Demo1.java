package com.Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args){

        //Array of Animal objects
        Animal[] animalArray = {new Cat(), new Dog()};

        //call makeSound method
        animalArray[0].makeSound();
        animalArray[1].makeSound();

        //Array of Shape objects
        Shape[] shapeArray = {new Rectangle(2.0, 3.0),new Circle(5)};

        System.out.println("The area of the rectangle is: "+ shapeArray[0].calculateArea() );
        System.out.println("The area of the circle is: "+ shapeArray[1].calculateArea() );

        //Array of Person objects
        Person[] personArray = {new Teacher(), new Student()};
        //call the greet method
        personArray[0].greet();
        personArray[1].greet();

        //Array of Vehicle objects
        Vehicle[] vehicleArray = {new Car(),new Motorcycle()} ;
        //call the drive method
        vehicleArray[0].drive();
        vehicleArray[1].drive();
        List mydata = new ArrayList<>();


    }
}
