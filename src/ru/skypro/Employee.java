package ru.skypro;

public class Employee {
    private String employeeName;
    private int department;
    private int salary;
    private int id;
    private static int idCounter;

    public Employee(String employeeName, int department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя сотрудника: " + employeeName + " Отдел: " + department + " Зарплата: "  + salary;
    }

    public static int calculateTotalSalary(Employee[] listOfEmployees) {
        int total = 0;
        for (Employee salary : listOfEmployees) {
            total += salary.getSalary();
        }
        return total;
    }

    public static int calculateMinSalary(Employee[] listOfEmployees) {
        int min = Integer.MAX_VALUE;
        for (Employee salary : listOfEmployees) {
            min = Math.min(min, salary.getSalary());
        }
        return min;
    }

    public static int calculateMaxSalary(Employee[] listOfEmployees) {
        int max = Integer.MIN_VALUE;
        for (Employee salary : listOfEmployees) {
            max = Math.max(max, salary.getSalary());
        }
        return max;
    }

    public static int calculateAverageValue(Employee[] listOfEmployees) {
        int total = 0;
        for (Employee salary : listOfEmployees) {
            total += salary.getSalary();
        }
        int average = total / listOfEmployees.length;
        return average;
    }
}