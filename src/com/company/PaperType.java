package com.company;

public enum PaperType{
    NEWSPAPER(0.1), GLOSSY(0.3), STANDARD(0.2);

    private double numVal;

    PaperType(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }

}
