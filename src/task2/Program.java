package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//
//Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
//        Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
//        Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
//        Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.

public class Program {
    private static Random random=new Random();

    public static Employee generateEmployee(){

//        String employeeList=new ArrayList<>(Arrays.asList(arr));
//        employeeList.
//
//        Employee[]employees;




        String[] wNames = new String[]{"Анна","Мария","Наталья","Марфа"};
        String[] wSurNames = new String[]{"Иванова","Петрова","Степанова","Кузьмина"};

        String[]fNames = new String[]{"Инна","Василиса","Елена","Алена","Галина"};
        String[] fSurNames = new String[]{"Певцова","Калашникова","Котова","Савина","Крамцова"};


        int salaryIndex=random.nextInt(200,500);

        Random ranType=new Random();
        int EmpType=ranType.nextInt(0,10);




        if(EmpType<=5){

            Employee employee = new Worker(wNames[random.nextInt(wNames.length)], wSurNames[random.nextInt(wSurNames.length)],100 * salaryIndex,random.nextInt(18, 45));
            return employee;

        }
        else{
            Employee employee = new Freelancer(fNames[random.nextInt(fNames.length)], fSurNames[random.nextInt(fSurNames.length)],salaryIndex*8*22,random.nextInt(18, 45));
            return employee;

        }

    }

    public static Employee[] generateEmployees(int count){
        Employee[] employees=new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i]=generateEmployee();

        }
        return employees;
    }







    public static void main(String[] args) {
//
        Employee[]employees=generateEmployees(8);
        for(Employee employee:employees){
            System.out.println(employee);
        }
        Arrays.sort(employees,new AgeComparator());
        System.out.println(Arrays.toString(employees));

        System.out.println("\nОтсортируем по возрасту\n");

        for(Employee employee:employees){
            System.out.println(employee);
        }



    }

}
