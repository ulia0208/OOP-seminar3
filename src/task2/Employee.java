package task2;

public abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surname;
    protected double salary;
    protected int age;

    public Employee(String name) {
    }

    public abstract double calculateSalary();

    public Employee(String name, String surname, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age=age;
    }


    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }

    public int compareTo(Employee o){
        int surnameRes= surname.compareTo(o.surname);

        if(surnameRes==0){
            return name.compareTo(o.name);

        }
        return surnameRes;
    }
}
