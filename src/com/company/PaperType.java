package com.company;

public enum PaperType{
    NEWSPAPER(1), GLOSSY(3), STANDARD(2);

    private int numVal;

    PaperType(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

}
