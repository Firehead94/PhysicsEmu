package com.questions;

import com.electricField.Electron;
import com.electricField.Particle;
import com.electricField.Proton;
import com.units.Constants;

public class QuestionTwo {

    public QuestionTwo() {

        Electron a = new Electron();
        Proton b = new Proton();

        System.out.println("Question #2 --------------------------------------");
        System.out.println("a) " + getBalanceForce(a));
        System.out.println("b) " + getBalanceForce(b));
        System.out.println("--------------------------------------------------");

    }

    private double getBalanceForce(Particle a) {
        return a.getMass()* Constants.Gravity.trueValue() /a.getCharge();
    }
}
