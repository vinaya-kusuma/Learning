package com.JavaBasicsAssn;
import java.util.ArrayList;
import java.util.Iterator;
public class StringArrayList {


        private ArrayList<String> stringList;

        public StringArrayList() {
            stringList = new ArrayList<>();
        }

        public void addString(String str) {
            stringList.add(str);
        }

        public void printAll() {
            Iterator<String> iterator = stringList.iterator();
            while (iterator.hasNext()) {
                String str = iterator.next();
                System.out.println(str);
            }
        }

        public static void main(String[] args) {
            StringArrayList example = new StringArrayList();
            example.addString("Hello");
            example.addString("World");
            example.addString("Java");
            example.printAll();
        }
    }

