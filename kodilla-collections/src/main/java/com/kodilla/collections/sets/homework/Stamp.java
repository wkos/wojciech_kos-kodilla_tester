package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double length;
    private boolean stamped;

    public Stamp(String name, double width, double length, boolean stamped) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.stamped = stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0
                && Double.compare(stamp.length, length) == 0
                && stamped == stamp.stamped
                && name.equals(stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, length, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", stamped=" + stamped +
                '}';
    }
}
