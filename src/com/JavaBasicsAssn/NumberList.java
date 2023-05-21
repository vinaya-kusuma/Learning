package com.JavaBasicsAssn;

import java.util.ArrayList;

public class NumberList {

    private ArrayList <Number> numbers;
    public NumberList (){
        numbers = new ArrayList();
    }

    public void addNumber(Number number){
        numbers.add(number);

    }
    public Number getNumber(int index){
        return numbers.get(index);

    }
    public int size(){
        return numbers.size();
    }

}
