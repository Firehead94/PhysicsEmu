package com.tools;

import java.util.HashMap;
import java.util.Map;

public class Grid {

    Map<String, Point> object = new HashMap<String, Point>();

    Grid(){

    }

    boolean addPoint(char c, Point p) {
        object.put(String.valueOf(c), p);
        return true;
    }
}
