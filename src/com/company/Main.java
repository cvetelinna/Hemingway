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

        List<Machine> mcs = new ArrayList<>();
        mcs.add(new Machine(Color.BLACKANDWHITE, 3000, 2000));
        mcs.add(new Machine(Color.BLACKANDWHITE, 3000, 2000));
        mcs.add(new Machine(Color.BLACKANDWHITE, 3000, 2000));


    PrintingHouse ph = new PrintingHouse(12000, 12200, 60, ems, mcs);
        System.out.println(ph.sumSalaryExpenses());
        ph.startPrinting(test, 1);
        ph.startPrinting(test, 2);
        System.out.println(ph);

    }

}
