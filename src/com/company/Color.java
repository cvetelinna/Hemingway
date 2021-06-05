package com.company;

public enum Color {
    BLACKANDWHITE(1), COLORED(2);

    private double colorValue;

    Color(double colorValue) {
        this.colorValue = colorValue;
    }

    public double getFormatValue() {
        return colorValue;
    }
}
