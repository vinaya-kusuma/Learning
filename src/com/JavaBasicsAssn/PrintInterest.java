package com.JavaBasicsAssn;

public class PrintInterest {

    public static void main(String[] args) {
        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        if (gender=="Female"){
            if(age>1 && age <=58){

                System.out.println("Interest rate is 8.2%");
            }
            else if (age > 58 && age <=120){
                System.out.println("Interest rate is 7.6%");
            }

        }
        else if (gender == "Male"){
            if(age>1 && age <=60){

                System.out.println("Interest rate is 9.2%");
            }
            else if (age > 58 && age <=120){
                System.out.println("Interest rate is 8.3%");
            }


        }
    }
}