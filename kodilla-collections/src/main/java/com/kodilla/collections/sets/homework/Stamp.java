package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String dimensions;
    private boolean stamped;

    public Stamp(String name, String dimensions, boolean stamped) {
        this.name = name;
        this.dimensions = dimensions;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public String getDimensions() {
        return dimensions;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(name, stamp.name) && Objects.equals(dimensions, stamp.dimensions) && stamped == stamp.stamped;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimensions, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", stamped=" + stamped +
                '}';
    }
}