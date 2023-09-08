package task2;

import static java.lang.String.format;

public class Worker extends Employee{
    public Worker(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Работница, среднемесячная зарплата(фиксированная) %.2f, %d лет", surname,name,salary,age);
    }
}
