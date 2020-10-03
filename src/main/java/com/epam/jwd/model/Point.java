package com.epam.jwd.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Point {
    private static Logger log = LoggerFactory.getLogger(Point.class);

    private int x;

    public Point(final int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void log() {
        log.info(toString());
    }

    @Override
    public String toString() {
        return "" + x;
    }
}
