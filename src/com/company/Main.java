package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Employee> ems = new ArrayList<>();

        ems.add(new Employee(EmployeeType.MANAGER, 800));
        ems.add(new Employee(EmployeeType.OPERATOR, 800));
        ems.add(new Employee(EmployeeType.OPERATOR,  800));
        ems.add(new Employee(EmployeeType.OPERATOR, 800));
        ems.add(new Employee(EmployeeType.OPERATOR, 800));
        ems.add(new Employee(EmployeeType.OPERATOR, 800));
        ems.add(new Employee(EmployeeType.MANAGER,800));

        Edition editionTest = new Edition("Qnko", 3000, PageFormat.А3, PaperType.GLOSSY, 100);
        Edition test = new Edition("Harry Potter", 3000, PageFormat.А3 , PaperType.GLOSSY, 300);
        List<Edition> editions = new ArrayList<>();

        editions.add(test);
        editions.add(editionTest);

        double sum = 0;
        double win = 0;
        for(var edt : editions){
            sum += edt.price() * edt.getRequrestedCount();
            win += edt.calculateBookIncome();
        }

        double bonus = 0;
        double managerBonus=0;

        for(var employee : ems){
            double brute = employee.getSalary();
            bonus += brute;
        }
        double tmp = win - (sum + bonus);
        if ( tmp > 0) {
            managerBonus += tmp;
            var printManagerBonus = String.format("Managers should separate %s between them", managerBonus);
            System.out.println(printManagerBonus);
        }

        var printBookExpenses = String.format("Material expenses are %s leva", sum);
        var printBookIncome = String.format("We win %s leva from books", win);
        var printSalaryExpenses = String.format("Salary expenses are %s", bonus );

        System.out.println(printBookExpenses);
        System.out.println(printBookIncome);
        System.out.println(printSalaryExpenses);

        List<Machine> mcs = new ArrayList<>();
        mcs.add(new Machine(Color.BLACKANDWHITE, 3000, 2000));
        mcs.add(new Machine(Color.COLORED, 3000, 2000));
        mcs.add(new Machine(Color.BLACKANDWHITE, 3000, 2000));


    PrintingHouse ph = new PrintingHouse(ems, mcs);
        //ph.startPrinting(test);
        //ph.startPrinting(editionTest);

    }

}
