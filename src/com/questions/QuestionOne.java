package com.questions;

import com.electricField.Particle;
import com.tools.Grid;
import com.tools.Point;
import com.units.BaseUnit;
import com.units.Constants;
import com.units.Coulomb;

public class QuestionOne {

    Particle A = new Particle(new Coulomb(3.15, -4));
    Particle B = new Particle(new Coulomb(-5.88, -4));
    Particle C = new Particle(new Coulomb(1.07, -4));

    Grid grid = new Grid();

    public QuestionOne() {
        grid.addPoint('A', new Point(0,0).setP(A));
        grid.addPoint('B', new Point(4,0).setP(B));
        grid.addPoint('C', new Point(0,3).setP(C));

        System.out.println("Question #1 --------------------------------------");
        System.out.println("a) " + getXComp(grid, 'A', 'C'));
        System.out.println("b) " + getYComp(grid, 'A', 'C'));
        System.out.println("c) " + getEField(grid, 'B', 'C'));
        System.out.println("d) " + getXComp(grid, 'B', 'C'));
        System.out.println("e) " + getYComp(grid, 'B', 'C'));
        System.out.println("--------------------------------------------------");

    }

    static double getEField(Grid grid, char pointActing, char point) {
        double field = 0;
        Point q1 = grid.getPoint(pointActing);
        Point q2 = grid.getPoint(point);

        double r = Point.getDistance(q2, q1);

        field = Constants.KElectric.trueValue() * q1.getCharge() * q2.getCharge() / Math.pow(r,2);
        field = Math.sqrt(Math.pow(field,2));
        return (double)Math.round(field*100)/100;
    }

    static double getXComp(Grid grid, char pointActing, char point) {
        double xComp = 0;
        double eField = getEField(grid, pointActing, point);
        Point q1 = grid.getPoint(pointActing);
        Point q2 = grid.getPoint(point);

        double r = Point.getDistance(q1, q2);
        if (q1.x - q2.x == 0) {
            return 0;
        }

        double angle = Math.atan2(q1.y - q2.y, q1.x - q2.x);
        if (q1.y - q2.y == 0) {
            angle *= -1;
        }
        xComp = eField * Math.cos(angle);
       // xComp = Math.sqrt(Math.pow(xComp,2));
        return (double)Math.round(xComp * 100)/100;

    }

    static double getYComp(Grid grid, char pointActing, char point) {
        double yComp = 0;
        double eField = getEField(grid, pointActing, point);
        Point q1 = grid.getPoint(pointActing);
        Point q2 = grid.getPoint(point);

        double r = Point.getDistance(q1, q2);
        if (q1.y - q2.y == 0) {
            return 0;
        }
        double angle = Math.atan((q1.y - q2.y)/(q1.x - q2.x));
        if (q1.x - q2.x == 0) {
            angle *= -1;
        }
        yComp = eField * Math.sin(angle);
       // yComp = Math.sqrt(Math.pow(yComp,2));
        return (double)Math.round(yComp * 100)/100;
    }

}
