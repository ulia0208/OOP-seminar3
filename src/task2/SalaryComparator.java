package task2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2){

        return Double.compare(o1.calculateSalary(), o2.calculateSalary());

//        if (o1.calculateSalary()==o2.calculateSalary()){
//            return 0;
//        } else if (o1.calculateSalary()>o2.calculateSalary()) {
//            return 1;
//
//        }
//        else {
//            return -1;
//        }
    }
}
