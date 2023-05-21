package com.JavaBasicsAssn;

public class PrintPrime {
    public static void main(String[] args) {
        boolean isPrime;
        for (int num = 10; num <= 99; num++) {

            isPrime= checkIfPrime(num);
            if (isPrime)
                System.out.println(num);
        }
    }

    public static boolean  checkIfPrime(int num){



        for (int i=2;i<num/2;i++) {
            if (num%i==0) {

            return false;
            }
        }
        return true;
    }
}




