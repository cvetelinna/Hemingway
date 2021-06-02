package com.company;
public enum EmployeeType {
    OPERATOR(1), MANAGER(2);

    private int numVal;

    EmployeeType(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

}
