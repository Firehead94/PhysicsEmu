package com.questions;

import com.circuits.Capacitor;
import com.units.BaseUnit;

public class QuestionTen {

    public QuestionTen() {

        Capacitor c1 = new Capacitor(3, -6);
        Capacitor c2 = new Capacitor(20, -6);
        Capacitor c3 = new Capacitor(6, -6);
        Capacitor c4 = new Capacitor(20,-6);

        Capacitor c1c2 = Capacitor.newCapacitor(c1, c2, 0);
        Capacitor c1c2c3 = Capacitor.newCapacitor(c1c2, c3, 1);
        Capacitor c1c2c3c4 = Capacitor.newCapacitor(c1c2c3, c4, 0);

        BaseUnit v = new BaseUnit(16, 0, "V");

        System.out.println("Question #10 --------------------------------------");
        System.out.println("a) " + c1c2c3c4.getCapacitance());
        System.out.println("b) " + c1c2c3c4.getCapacitance() * v.trueValue());
        System.out.println("c) " + c1c2c3.getCapacitance() * v.trueValue()/2);
        System.out.println("d) " + ((c1c2c3c4.getCapacitance() * v.trueValue()) - (c1c2c3.getCapacitance() * v.trueValue()/2)));
        System.out.println("--------------------------------------------------");

    }

}
