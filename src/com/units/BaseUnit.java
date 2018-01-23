package com.units;

public class BaseUnit {

    double value;
    int orderOfMagnitude;
    String symbol;

    public BaseUnit(double v, int o, String s) {
        value = v;
        orderOfMagnitude = o;
        symbol = s;
    }

    public double trueValue() {
        return (double)Math.pow(10, orderOfMagnitude)*value;
    }
}
