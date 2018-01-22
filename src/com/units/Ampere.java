package com.units;

public class Ampere extends UnitBase{

    Ampere() {
        super();
        this.setSymbol('A');
    }

    Ampere(double i) {
        super(i);
        this.setSymbol('A');
    }

    Ampere(double i, int j) {
        super(i, j);
        this.setSymbol('A');
    }
}
