package com.JavaBasicsAssn;

public class PrintValues {

    public static void main(String[] args){

        if (args.length ==0) {
            System.out.println("No Values");

        }

        else {
            //using String.join
            //String value = String.join(",",args);
            //System.out.print(value);

            //using StringBuilder
            StringBuilder value = new StringBuilder();
            for (int i = 0; i < args.length; i++) {

                value.append(args[i]);

                if(i < args.length-1){
                    value.append(",");
                }
            }
            System.out.print(value);

        }

    }
}
