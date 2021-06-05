package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	//Edition editionTest = new Edition("Qnko", 300, PageFormat.А3, PaperType.GLOSSY);
    List<Employee> ems = new ArrayList<>();
        ems.add(new Employee(EmployeeType.MANAGER));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.MANAGER));

        Edition test = new Edition("Harry Potter", 300, PageFormat.А3 , PaperType.GLOSSY, 30);
        System.out.println(test.price());
        System.out.println(test.calculateBookIncome());


    PrintingHouse ph = new PrintingHouse(12000, 12200, 60, ems);
        System.out.println(ph.sumSalaryExpenses());
    }

}
