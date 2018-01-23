package com.questions;

import com.electricField.Electron;
import com.electricField.Particle;
import com.electricField.Proton;
import com.units.Constants;

public class QuestionTwo {

    public QuestionTwo() {

        Electron a = new Electron();
        Proton b = new Proton();

        System.out.println("a) " + getBalanceForce(a));
        System.out.println("b) " + getBalanceForce(b));

    }

    private double getBalanceForce(Particle a) {
        return a.getMass()* Constants.Gravity.trueValue() /a.getCharge()/10;
    }
}
