package com.company;
public class Employee {
    private EmployeeType employeeType;
    private double salary;

    public Employee(EmployeeType employeeType, double salary) {
        this.employeeType = employeeType;
        this.salary = salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeType=" + employeeType +
                "salary=" + salary +
                '}';
    }
}
