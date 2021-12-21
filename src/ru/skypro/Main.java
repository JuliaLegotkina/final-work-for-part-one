package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Employee[] listOfEmployees = new Employee[10];
        listOfEmployees[0] = new Employee("Nancy Smith", 1, 36_000);
        listOfEmployees[1] = new Employee("Dave Johnson", 2, 82_000);
        listOfEmployees[2] = new Employee("Jane Williams", 3, 74_000);
        listOfEmployees[3] = new Employee("Nora Brown", 4, 55_000);
        listOfEmployees[4] = new Employee("Mark Jones", 5, 156_000);
        listOfEmployees[5] = new Employee("Anthony Garcia", 1, 92_000);
        listOfEmployees[6] = new Employee("Kate Miller", 2, 70_000);
        listOfEmployees[7] = new Employee("John Davis", 3, 81_000);
        listOfEmployees[8] = new Employee("Richard Rodriguez", 4, 14_000);
        listOfEmployees[9] = new Employee("Alex Martinez", 5, 101_000);

        for (int i = 0; i < listOfEmployees.length; i++) {
            System.out.println(listOfEmployees[i]);
        }

        System.out.println("В сумме сотрудники компании получают " + Employee.calculateTotalSalary(listOfEmployees) + " рублей в месяц.");

        System.out.println("Минимальной зарплатой является " + Employee.calculateMinSalary(listOfEmployees) + " рублей в месяц.");

        System.out.println("А вот максимальная зарплата — " + Employee.calculateMaxSalary(listOfEmployees) + " рублей в месяц.");

        System.out.println("В среднем сотрудники получают " + Employee.calculateAverageValue(listOfEmployees) + " в месяц.");

        System.out.println ("В компании работают следующие сотрудники:");
        for (int i = 0; i < listOfEmployees.length; i++) {
            System.out.println(listOfEmployees[i].getEmployeeName());
        }
    }
}