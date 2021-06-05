package com.company;

public enum PaperType{
    NEWSPAPER(0.01), GLOSSY(0.03), STANDARD(0.02);

    private double numVal;

    PaperType(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }

}
