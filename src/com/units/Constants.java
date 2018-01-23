package com.units;

public enum Constants {

    KElectric(8.99, 9, "C"),
    Gravity(9.8,1,"M/S^2");

    BaseUnit unit;
    Constants(double v, int i, String c) {
        unit = new BaseUnit(v, i, c);
    }

    public double trueValue() {
        return unit.trueValue();
    }
}
