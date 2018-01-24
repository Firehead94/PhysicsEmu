package com.questions;

import com.electricField.Electron;
import com.electricField.Particle;
import com.units.BaseUnit;
import com.units.Constants;
import com.units.Coulomb;
import com.units.Speed;

public class QuestionSeven {

    public QuestionSeven() {

        Particle p1 = new Particle((Coulomb)Electron.getElectronCharge().increaseValue(2, 1), new BaseUnit(6.64, -27, "kg")); // Alpha
        Particle p2 = new Particle((Coulomb)Electron.getElectronCharge().increaseValue(79, 1), new BaseUnit(3.2706, -19, "kg")); // Gold
        Speed s1 = new Speed(1.69, 7); // Speed Alpha
        Speed s2 = new Speed(0,0); // Speed Gold

        System.out.println("Question #7 --------------------------------------");
        System.out.println("a) " + getMinDist(p1, s1, p2, s2));
        System.out.println("--------------------------------------------------");

    }

    private double getMinDist(Particle p1, Speed s1, Particle p2, Speed s2) {
        double minDist = 0;

        minDist = 0.5 * p1.getMass() * Math.pow(s1.trueValue(), 2);
        minDist = (Constants.KElectric.trueValue() * p1.getCharge() * p2.getCharge()) / minDist;

        return minDist;
    }
}
