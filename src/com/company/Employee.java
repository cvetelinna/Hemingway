package com.company;

import java.util.List;

public class Employee {
    private EmployeeType employeeType;


    public Employee(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeType=" + employeeType +
                '}';
    }

    public boolean isManager() {
        if (this.employeeType == EmployeeType.MANAGER){
            return true;
        }
        else return false;
    }

}
