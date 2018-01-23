package com.electricField;

import com.units.BaseUnit;
import com.units.Coulomb;

public class Neutron extends Particle {

    public Neutron() {
        super(new Coulomb(0, 0), new BaseUnit(1.67, -27, "kg"));
    }

}
