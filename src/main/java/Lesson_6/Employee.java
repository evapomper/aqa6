package Lesson_6;

import com.github.javafaker.Faker;

import java.math.BigDecimal;
import java.util.Random;

public class Employee {
    private String fio;
    private String position;
    private int age;
    private String email;
    private String phoneNumber;
    private BigDecimal salary;

    public Employee(String fio, String position, int age, String email, String phoneNumber, int salary) {
        this.fio = fio;
        this.position = position;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = BigDecimal.valueOf(salary);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = BigDecimal.valueOf(salary);
    }

    public static Employee createEmployee(String fio, String position, int age, String email, String phoneNumber, int salary) {
        return new Employee(fio, position, age, email, phoneNumber, salary);
    }

    public static Employee createRandomEmployee() {
        String[] names = {"John Doe", "Jane Smith", "Alice Johnson", "Bob Brown"};
        String[] positions = {"Developer", "Manager", "Analyst", "Tester"};
        Random rand = new Random();

        String fio = names[rand.nextInt(names.length)];
        String position = positions[rand.nextInt(positions.length)];
        int age = 25 + rand.nextInt(25);
        String email = fio.toLowerCase().replace(" ", ".") + "@example.com";
        String phoneNumber = "1234567890";
        int salary = 30000 + rand.nextInt(40000);

        return new Employee(fio, position, age, email, phoneNumber, salary);
    }

    public static Employee createFakeEmployee() {
        Faker faker = new Faker();
        String fio = faker.name().fullName();
        String position = faker.job().position();
        int age = faker.number().numberBetween(18, 65);
        String email = faker.internet().emailAddress();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        int salary = faker.number().numberBetween(30000, 100000);

        return new Employee(fio, position, age, email, phoneNumber, salary);
    }

    public static void printEmployee(Employee employee) {
        System.out.println("ФИО: " + employee.getFio());
        System.out.println("Должность: " + employee.getPosition());
        System.out.println("Возраст: " + employee.getAge());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhoneNumber());
        System.out.println("Зарплата: " + employee.getSalary());
    }
}
