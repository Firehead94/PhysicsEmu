package com.units;

public class ElectricField extends BaseUnit {

    public ElectricField(double v, int o, byte s) {
        super(v, o, s == 0 ? "N/C" : "V/m");
    }
}
