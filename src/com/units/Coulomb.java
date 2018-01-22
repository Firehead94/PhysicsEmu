package com.units;

public class Coulomb extends Ampere {

    double value;

    public Coulomb() {
        this(6.24, 18);
    }

    public Coulomb(double i) {
        this(i, 18);
    }

    public Coulomb(double i, int j) {
        super(i, j);
        this.setSymbol('C');
        setValue();
    }

    public void setValue() {
        value = Math.pow(this.amt.floatValue(), this.orderOfMagnitude)/(6.24*Math.pow(10, 18));
    }

}
