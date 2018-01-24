package com.questions;

import com.electricField.Particle;
import com.tools.Grid;
import com.tools.Point;
import com.units.Coulomb;
import com.units.ElectricField;

public class QuestionSix {

    public QuestionSix() {

        ElectricField field = new ElectricField(260, 0, (byte)1);
        Particle p = new Particle(new Coulomb(10, -6));
        Grid grid = new Grid();
        Point p1 = new Point(0,0).setP(p);
        Point p2 = new Point(0.20,0.50).setP(p);
        double distance = Point.getDistance(p1, p2);

        System.out.println("Question #6 --------------------------------------");
        System.out.println("a) " +  getPotentialEChange(p1, p2, field));
        System.out.println("b) " + getPotentialEChange(p1, p2, field)/p.getCharge());
        System.out.println("--------------------------------------------------");
    }

    private double getPotentialEChange(Point p1, Point p2, ElectricField field) {
        double pEChange = 0;
        pEChange = p2.getCharge() * field.trueValue() * (p2.x - p1.x);
        return pEChange;
    }
}
