package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Edition editionTest = new Edition("Qnko", 30, PageFormat.А3, PaperType.GLOSSY);
        System.out.println(editionTest.price());
    List<Employee> ems = new ArrayList<>();
        ems.add(new Employee(EmployeeType.MANAGER));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.MANAGER));

    PrintingHouse ph = new PrintingHouse(12000, 12200, 60, ems);
        System.out.println(ph.sumSalaryExpenses());
    }
}
