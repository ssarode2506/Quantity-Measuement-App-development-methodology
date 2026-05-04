package com.apps.quantitymeasurement;

public class Length {

    private double value;
    private LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    double toBase() {
        return value * unit.getFactor();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Length other = (Length) obj;

        return Double.compare(this.toBase(), other.toBase()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(toBase());
    }

    public double convertToInches() {
        return 0;
    }

    public double toInches() {
        return 0;
    }

    public Length subtract(Length l2) {

        return l2;
    }

    public double divide(Length l2) {

        return 0;
    }

    public Object add(Length length) {

        return null;
    }
}