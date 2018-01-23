package com.units;

public enum Constants {

    KElectric(8.99, 9, "C"),
    Gravity(9.8,0,"m/s^2"),
    Permittivity(8.85, -12, "s^4 A^2 / kg m^3");

    BaseUnit unit;
    Constants(double v, int i, String c) {
        unit = new BaseUnit(v, i, c);
    }

    public double trueValue() {
        return unit.trueValue();
    }
}
