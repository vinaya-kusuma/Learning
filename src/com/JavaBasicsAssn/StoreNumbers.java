//Create an ArrayList which will be able to store only numbers like int,float,double,etc, but
//not any other data type.

package com.JavaBasicsAssn;

public class StoreNumbers {
    public static void main(String[] args){
        NumberList numberList = new NumberList();
        numberList.addNumber(12);
        numberList.addNumber(1.5);
        numberList.addNumber(7.1f);

        Number number;
        for(int i=0;i< numberList.size();i++){
            System.out.println(numberList.getNumber(i));

        }


    }


}
