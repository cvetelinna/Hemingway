package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Employee> ems = new ArrayList<>();

        ems.add(new Employee(EmployeeType.MANAGER));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.OPERATOR));
        ems.add(new Employee(EmployeeType.MANAGER));

        Edition editionTest = new Edition("Qnko", 300, PageFormat.А3, PaperType.GLOSSY, 10);
        Edition test = new Edition("Harry Potter", 300, PageFormat.А3 , PaperType.GLOSSY, 30);
        List<Edition> editions = new ArrayList<>();

        editions.add(test);
        editions.add(editionTest);

        double sum = 0;
        double win = 0;
        for(var edt : editions){
            sum += edt.price() * edt.getRequrestedCount();
            win += edt.calculateBookIncome();
        }
        var printBookExpenses = String.format("Material expenses are %s leva", sum);
        var printBookIncome = String.format("We win %s leva from books", win);
        System.out.println(printBookExpenses);
        System.out.println(printBookIncome);

        List<Machine> mcs = new ArrayList<>();
        mcs.add(new Machine(Color.BLACKANDWHITE, 3000, 2000));
        mcs.add(new Machine(Color.COLORED, 3000, 2000));
        mcs.add(new Machine(Color.BLACKANDWHITE, 3000, 2000));


    PrintingHouse ph = new PrintingHouse(12000, 12200, 60, ems, mcs);
        System.out.println(ph.sumSalaryExpenses());
        ph.startPrinting(test);
        ph.startPrinting(editionTest);

    }

}
