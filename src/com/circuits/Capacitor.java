package com.circuits;

import com.units.Ferrad;

public class Capacitor {

    Ferrad f;

    public Capacitor(double v, int o) {
        f = new Ferrad(v, o);
    }

    /**
     *
     * @param a
     * @param b
     * @param t 0 for series, 1 for parallel
     */
    public static Capacitor newCapacitor(Capacitor a, Capacitor b, int t) {
        switch(t) {
            case 0:
                return getCInSeries(a,b);
            default:
                return getCInParallel(a,b);

        }
    }

    private static Capacitor getCInSeries (Capacitor a, Capacitor b) {
        double capacitance = (1/a.getCapacitance()) + (1/b.getCapacitance());
        int oom = 0;
        while (capacitance*10 < 1) {
            oom--;
            capacitance *= 10;
        }

        return new Capacitor(1/capacitance, oom);
    }

    private static Capacitor getCInParallel(Capacitor a, Capacitor b) {
        double capacitance = a.getCapacitance() + b.getCapacitance();
        int oom = 0;
        while (capacitance/10 >= 1) {
            oom++;
            capacitance /= 10;
        }

        return new Capacitor(capacitance, oom);
    }

    public double getCapacitance() {
        return f.trueValue();
    }

    public Ferrad getF() {
        return f;
    }
}
