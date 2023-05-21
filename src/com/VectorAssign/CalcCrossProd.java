package com.VectorAssign;

import java.util.Vector;

public class CalcCrossProd {

    public Vector crossProduct(Vector<Double> v1, Vector <Double> v2){
        Vector<Double>  v3 = new Vector<>();
        Double a = (v1.get(1)*v2.get(2)) - (v1.get(2)*v2.get(1)) ;
        Double b = -((v1.get(0)*v2.get(2)) - (v1.get(2)*v2.get(0)) );
        Double c = (v1.get(0)*v2.get(1)) - (v1.get(1)*v2.get(0)) ;
        v3.add(0,a);
        v3.add(1,b);
        v3.add(2,c);
        return v3;

    }
}
