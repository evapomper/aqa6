package Lesson_6;

public class Lesson6Task2 {
    public static Employee[] createEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = Employee.createRandomEmployee();
        }
        return employees;
    }
}
