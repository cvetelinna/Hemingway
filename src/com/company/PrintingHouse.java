package com.company;
import java.util.List;

public class PrintingHouse {

    private double expectedIncome;
    private double actualIncome;
    private int printedEditionsCount;
    private List<Employee> employees;
    private static double salary = 800;
    private List<Machine> machines;

    public PrintingHouse(double expectedIncome, double actualIncome, int printedEditionsCount, List<Employee> employees, List<Machine> machines) {
        this.expectedIncome = expectedIncome;
        this.actualIncome = actualIncome;
        this.printedEditionsCount = printedEditionsCount;
        this.employees = employees;
        this.machines = machines;
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

    public List<Machine> getMachines(){
        return machines;
    }

    @Override
    public String toString() {
        return "PrintingHouse{" +
                ", expectedIncome=" + expectedIncome +
                ", actualIncome=" + actualIncome +
                ", printedEditionsCount=" + printedEditionsCount +
                ", employees=" + employees +
                ", machines=" + machines +
                '}';
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

    public void startPrinting(Edition ed){
        this.machines
                .forEach(machine -> new Thread(() -> machine.print(ed)).start());
    }
}
