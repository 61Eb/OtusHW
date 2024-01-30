package hw.homework15;

import java.util.ArrayList;

public class Homework15 {
    public static ArrayList<Integer> generateRange(int min, int max) {
        ArrayList<Integer> range = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            range.add(i);
        }
        return range;
    }
    public static int sumElementsGreaterThanFive(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }
    public static void rewriteListCells(int number, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }
    public static void increaseListElements(int number, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    public static ArrayList<String> getEmployeeNames(ArrayList<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }
    public static ArrayList<Employee> getEmployeesWithMinimumAge(ArrayList<Employee> employees, int minAge) {
        ArrayList<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }
    public static boolean checkAverageAge(ArrayList<Employee> employees, int minAverageAge) {
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        int averageAge = totalAge / employees.size();
        return averageAge > minAverageAge;
    }
    public static Employee getYoungestEmployee(ArrayList<Employee> employees) {
        Employee youngestEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngestEmployee.getAge()) {
                youngestEmployee = employee;
            }
        }
        return youngestEmployee;
    }
}
