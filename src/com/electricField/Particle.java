package com.electricField;

import com.units.BaseUnit;
import com.units.Coulomb;

public class Particle {

    Coulomb charge;
    BaseUnit mass;

    public Particle(Coulomb charge){
        this.charge = charge;
    }

    public Particle(Coulomb charge, BaseUnit mass){
        this.charge = charge;
        this.mass = mass;
    }

    public double getCharge() {
        return charge.trueValue();
    }

    public double getMass() {
        return mass.trueValue();
    }

}
