package com.units;

import java.math.BigDecimal;

public class UnitBase {

    BigDecimal amt;
    byte orderOfMagnitude;
    String symbol;

    UnitBase() {
        this(1);
    }

    UnitBase(double i) {
        this(i, 1);
    }

    UnitBase(double i, int o) {
        amt = BigDecimal.valueOf(i);
        orderOfMagnitude = (byte)o;
    }

    public void IncreaseMagnitude(byte a) {
        this.orderOfMagnitude += a;
    }

    public void setSymbol(char c){
        symbol = String.valueOf(c);
    }

    public void setSymbol(String c){
        symbol = c;
    }

    double getValue() {
        return amt.doubleValue()*Math.pow(10, orderOfMagnitude);
    }

}
