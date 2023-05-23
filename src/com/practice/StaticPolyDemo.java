package com.practice;

public class StaticPolyDemo {
    public static void main(String[] args){
        AddNumbers addNum  = new AddNumbers();
        int result1 = addNum.sum();
        int result2 = addNum.sum(5,8);
        int result3 = addNum.sum(1,2,3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
