package com.MethodReferencesExamples;

public class MainClass {

    public static void main(String[] args) {
        PersonFactory pf = Person::new;
        Person person = pf.create(1,"Anish");
        System.out.println(person.getId());
        System.out.println(person.getName());
    }
}
