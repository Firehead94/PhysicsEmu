package com.electricField;

import com.units.BaseUnit;
import com.units.Coulomb;

public class Electron extends Particle {

    public Electron() {
        super(new Coulomb(-1.6, -19), new BaseUnit(9.11, -31, "kg"));
    }


    public static Coulomb getElectronCharge() {
        
        return new Coulomb(-1.6, -19);
    }

}
