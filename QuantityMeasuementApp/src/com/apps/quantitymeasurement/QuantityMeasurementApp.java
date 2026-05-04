package com.apps.quantitymeasurement;

class QantityMeasurementApp {

    private double value;
    private LengthUnit unit;

    public void Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
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
}