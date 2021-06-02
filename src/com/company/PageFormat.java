package com.company;

public enum PageFormat {
    А1(1), А2(2), А3(3), А4(4), А5(5);

    private int formatValue;

    PageFormat(int formatValue) {
        this.formatValue = formatValue;
    }

    public int getFormatValue() {
        return formatValue;
    }
}

