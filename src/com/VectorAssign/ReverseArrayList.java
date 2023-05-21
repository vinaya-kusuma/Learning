package com.VectorAssign;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    public List reverseList(List myArray){

        List<Integer> reverseArray = new ArrayList();
        int max= myArray.size()-1;

        for(int i=0;i<myArray.size();i++){
            reverseArray.add(i, (Integer) myArray.get(max-i));

        }
        return reverseArray;
    }
}
