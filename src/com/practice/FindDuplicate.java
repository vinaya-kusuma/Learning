package com.practice;

public class FindDuplicate {

    public static void main(String[] args) {

        String str = "hello world";
        int count;

        char[] ch = new char[str.length()];
        for (int k=0;k<str.length();k++) {
            ch[k] = str.charAt(k);
        }

        System.out.println(ch);

        for (int i=0;i<ch.length;i++){
            count = 1;
            for(int j=i+1;j<ch.length;j++){

                if (i!= j && ch[i]==ch[j] && ch[i] !='0'){
                    ch[j] = '0';
                    count++;
                }
            }
            if (count >1)
            System.out.println("the character " + ch[i] + " is found " + count + " times");
        }
    }
}
