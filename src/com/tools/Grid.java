package com.tools;

import com.units.BaseUnit;

import java.util.HashMap;
import java.util.Map;

public class Grid {

    Map<Character, Point> grid = new HashMap<>();
    BaseUnit units;

    public Grid(){}

    public void addPoint(char c, Point p) {
        grid.put(c, p);
    }

    public Point getPoint(char c) {

        return grid.get(c);
    }

}
