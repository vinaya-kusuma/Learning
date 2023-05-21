package com.practice;

public class CommandLineInput {

    public static void main(String[] args){
        int number, validCount =0, inValidCount = 0;
        for (int i=0;i<args.length;i++){
            try
            {
                number= Integer.parseInt(args[i]);
            }
            catch(NumberFormatException e){
                inValidCount++;
                System.out.println("Invalid  number at " +i+ args[i]);

            }

            validCount++;
            System.out.println("Valid  number at " +i+ args[i]);
        }

        System.out.println("Valid count: " + validCount);
        System.out.println("InValid count: " + inValidCount);
    }

}
