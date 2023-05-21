package com.VectorAssign;

import java.util.List;

public class CalcMaxValue {

    public int maxValue(List<Integer> myArray){
        int max = myArray.get(0);
        for(int i=1;i<myArray.size();i++)
        {
            if (myArray.get(i) > max){}
            max = myArray.get(i);
        }

        return max;
    }
}
