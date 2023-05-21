package com.practice;

public class DivideZero {
    public int dividend(int x, int y) {
    try {
        int a = x / y;
        return a;
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }

        return 0;
    }
}
