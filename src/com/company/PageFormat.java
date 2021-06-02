package com.company;

public enum PageFormat {
    А1(0.1), А2(0.2), А3(0.3), А4(0.4), А5(0.5);

    private double formatValue;

    PageFormat(double formatValue) {
        this.formatValue = formatValue;
    }

    public double getFormatValue() {
        return formatValue;
    }
}

