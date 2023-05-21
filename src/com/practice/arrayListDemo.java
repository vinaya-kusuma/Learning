package com.practice;
import java.util.*;

public class arrayListDemo {

    public static void main(String[] args){
        //define a1 as ArrayList
        Collection  a1 = new ArrayList();

        a1.add(10);
        a1.add(20);

        Iterator it = a1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());

        }


    }
}
