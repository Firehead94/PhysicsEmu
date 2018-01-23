package com.electricField;

import com.units.BaseUnit;
import com.units.Coulomb;

public class Proton extends Particle {

    public Proton() {
        super(new Coulomb(1.6, -19), new BaseUnit(1.67, -27, "kg"));
    }

}
