package com.questions;

import com.electricField.Particle;
import com.units.BaseUnit;
import com.units.Constants;
import com.units.Coulomb;

public class QuestionFour {

    public QuestionFour() {

        Particle p = new Particle(new Coulomb(32.5, -6));
        BaseUnit radius = new BaseUnit(26,-2, "cm");

        System.out.println("Question #4 --------------------------------------");
        System.out.println("a) " + getFlux(p));
        System.out.println("b) " + getFlux(p)/2);
        System.out.println("--------------------------------------------------");

    }

    private double getFlux(Particle p) {
        return p.getCharge()/ Constants.Permittivity.trueValue();
    }
}
