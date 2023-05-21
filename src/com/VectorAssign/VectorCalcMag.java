package com.VectorAssign;

import java.util.Vector;
public class VectorCalcMag {

    public double calcMag(Vector vector){
        double mag =0;
        for (int i=0;i<vector.size();i++){

            mag += Math.pow((Double) vector.get(i),2);
        }

        return Math.sqrt(mag);
    }
}
