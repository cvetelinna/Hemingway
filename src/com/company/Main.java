package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.math.RoundingMode;
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

        Edition Qnko = new Edition("Qnko", 3000, PageFormat.А3, PaperType.GLOSSY, 10999);
        Edition HP = new Edition("Harry Potter", 3000, PageFormat.А3 , PaperType.GLOSSY, 3000);
        List<Edition> editions = new ArrayList<>();

        editions.add(HP);
        editions.add(Qnko);

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
            var printManagerBonus = String.format("Managers should divide %.2f between them", managerBonus);
            System.out.println(printManagerBonus);
        }

        var printBookExpenses = String.format("Material expenses are %.2f leva.", sum);
        var printBookIncome = String.format("We win %.2f leva from books", win);
        var printSalaryExpenses = String.format("Salary expenses are %.2f", bonus );

        System.out.println(printBookExpenses);
        System.out.println(printBookIncome);
        System.out.println(printSalaryExpenses);

        List<Machine> mcs = new ArrayList<>();
        mcs.add(new Machine(Color.BLACKANDWHITE, 3000, 100));
        mcs.add(new Machine(Color.COLORED, 3000, 100));
        mcs.add(new Machine(Color.BLACKANDWHITE, 3000, 100));


    PrintingHouse ph = new PrintingHouse(ems, mcs);
        System.out.println(ph);
        ph.startPrinting(HP);
        ph.startPrinting(Qnko);

        var sb = new StringBuilder();

        try(FileWriter file = new FileWriter("logs.txt", true)) {
            sb.append(printBookExpenses);
            sb.append("\n");
            sb.append(printSalaryExpenses);
            sb.append("\n");
            sb.append(printBookIncome);
            sb.append("\n");
            file.write(sb.toString());

        } catch (IOException e) {
            System.out.println("ERROR!");
            e.printStackTrace();
        }
    }
}
