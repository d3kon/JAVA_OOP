package hw3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Program {


    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        final int successorCount = 3;
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary;
        int successor = random.nextInt(successorCount);
        switch (successor){
            case 0:
                salary = random.nextInt(20000, 80000);
                return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                        random.nextInt(18, 65), salary);
            case 1:
                salary = random.nextInt(500, 1000);
                return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                        random.nextInt(18, 65), salary);
            case 2: salary = random.nextInt(100000, 200000);
                return new DepartmentHead(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                        random.nextInt(18, 65), salary);
        }
        return null;
    }

    static void showEmployees(Employee[] employees){
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println("------------------------------");
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);
        System.out.println("Сортировка по имени и заработной плате");
        showEmployees(employees);

        Arrays.sort(employees, new SalaryComparator<Employee>().reversed());
        System.out.println("Сортировка по заработной плате");
        showEmployees(employees);

        Arrays.sort(employees, new AgeAndSalaryComparator<Employee>());
        System.out.println("Сортировка по возрасту и заработной плате");
        showEmployees(employees);

        Arrays.sort(employees, (o1, o2) -> {
            int res = o1.getSurname().compareTo(o2.getSurname());
            if (res == 0){
                return o1.getName().compareTo(o2.getName());
            }
            return res;
        });
        System.out.println("Сортировка по фамилии и имени");
        showEmployees(employees);

    }

}
