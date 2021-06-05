package com.company;
public enum PageFormat {
    А1(0.01), А2(0.02), А3(0.03), А4(0.04), А5(0.05);

    private double formatValue;

    PageFormat(double formatValue) {
        this.formatValue = formatValue;
    }

    public double getFormatValue() {
        return formatValue;
    }
}

