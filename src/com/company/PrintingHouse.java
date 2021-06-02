package com.company;

/*
DONE - В печатницата работят два вида служители: оператори на печатни машини и мениджъри. И
DONE - двата вида служители получават едно и също основно заплащане. Мениджърите получават
DONE - определен процент върху основното заплащане, ако приходите на печатницата са повече от
DONE - определена стойност, която се задава в печатницата.

TODO: Приходите на печатницата са от отпечатаните издания, като се определя цена за отпечатване
TODO: на 1 бр. от съответното издание, което клиентът на печатницата заплаща. Ако отпечатваните
TODO: издания надхвърлят предварително зададен брой, на клиентите се прави отстъпка с определен
TODO: % от цената за отпечатване на 1 бр.

*/

import java.util.ArrayList;
import java.util.List;

public class PrintingHouse {

    private double expectedIncome;
    private double actualIncome;
    private int printedEditionsCount;
    private List<Employee> employees;
    private static double salary = 800;

    public PrintingHouse() {

    }

    public PrintingHouse(double expectedIncome, double actualIncome, int printedEditionsCount, List<Employee> employees) {
        this.expectedIncome = expectedIncome;
        this.actualIncome = actualIncome;
        this.printedEditionsCount = printedEditionsCount;
        this.employees = new ArrayList<>(); {
        };
    }


    public double getExpectedIncome() {
        return expectedIncome;
    }

    public double getActualIncome() {
        return actualIncome;
    }

    public int getPrintedEditionsCount() {
        return printedEditionsCount;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "PrintingHouse{" +
                ", expectedIncome=" + expectedIncome +
                ", actualIncome=" + actualIncome +
                ", printedEditionsCount=" + printedEditionsCount +
                ", employees=" + employees +
                '}';
    }

    public void fillEmployeeArray(){
        Employee employee1 = new Employee(EmployeeType.MANAGER);
        Employee employee2 = new Employee(EmployeeType.OPERATOR);
        Employee employee3 = new Employee(EmployeeType.OPERATOR);
        Employee employee4 = new Employee(EmployeeType.OPERATOR);
        Employee employee5 = new Employee(EmployeeType.OPERATOR);
        Employee employee6 = new Employee(EmployeeType.OPERATOR);
        Employee employee7 = new Employee(EmployeeType.MANAGER);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
    }

    public double sumSalaryExpenses() {
        double managerTmp = 0;
        int managerCounter = 0;
        for (Employee employee : employees)
        {
            if (employee.isManager())
            {
                managerCounter++;
                if (actualIncome > expectedIncome ) {
                    double diff = actualIncome - expectedIncome;
                    managerTmp += (int)((double)( salary + (diff / managerCounter)));
                    int operatorsCounter = employees.size() - managerCounter;
                    return (salary * operatorsCounter) + (managerTmp * managerCounter);
                }else return salary * employees.size();
            }
        }
        return salary * employees.size();
    }


}
