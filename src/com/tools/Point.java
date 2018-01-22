package com.tools;

public class Point {

    double x, y, z;

    Point(){
        this(0, 0);
    }

    Point(double x, double y) {
        this(x, y, 0);
    }

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2) + Math.pow(a.z - b.z, 2));
    }
}
