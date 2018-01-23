package com.tools;

import com.electricField.Particle;

public class Point {

    Particle p;
    public double x, y, z;

    public Point(double x, double y) {
        this(x, y, 0);
    }

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point setP(Particle p) {
        this.p = p;
        return this;
    }

    public double getCharge() {
        return this.p.getCharge();
    }

    public double getMass(){
        return this.p.getMass();
    }

    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2) + Math.pow(a.z - b.z, 2));
    }
}
