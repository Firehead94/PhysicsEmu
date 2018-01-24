package com.questions;

import com.electricField.Proton;
import com.units.ElectricField;
import com.units.Speed;

public class QuestionThree {

    public QuestionThree() {
        ElectricField field = new ElectricField(670,0, (byte)0);
        Speed speed = new Speed(1.30,6);

        System.out.println("Question #3 --------------------------------------");
        System.out.println("a) " + getAccel(new Proton(), field));
        System.out.println("b) " + getTime(new Proton(), field, speed));
        System.out.println("c) " + getDistance(new Proton(), field, speed));
        System.out.println("d) " + getKinetic(new Proton(), field, speed));
        System.out.println("--------------------------------------------------");
    }

    private double getKinetic(Proton proton, ElectricField field, Speed speed) {
        return 0.5 * proton.getMass() * Math.pow(getAccel(proton, field) * getTime(proton, field, speed),2);
    }

    private double getDistance(Proton proton, ElectricField field, Speed speed) {
        double a = getAccel(proton, field);
        double t = getTime(proton, field, speed);

        return 0.5 * a * Math.pow(t,2);
    }

    private double getTime(Proton proton, ElectricField field, Speed speed) {

        return speed.trueValue() / getAccel(proton, field);
    }

    private double getAccel(Proton proton, ElectricField field) {

        return proton.getCharge() * field.trueValue() / proton.getMass();
    }
}
