package hw7.observer;

import java.util.Random;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        jobAgency.registerObserver(new Master("Ivanov", "курьер"));
        jobAgency.registerObserver(new Master("Petrov", "Frontend-программист"));
        jobAgency.registerObserver(new Student("Sidorov", "Java-ПРОГРАММИСТ"));
        jobAgency.registerObserver(new DepartmentHead("Wayne", "Java-программист"));
        jobAgency.registerObserver(new Student("Parker", "Преподаватель"));
        jobAgency.registerObserver(new DepartmentHead("Osborn", "Backend-программист"));

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee(VacancyType.Teacher, randomSalary(70000, 100000));
            google.needEmployee(VacancyType.JavaProgrammer, randomSalary(150000, 200000));
            google.needEmployee(VacancyType.Frontend, randomSalary(100000, 105000));
            yandex.needEmployee(VacancyType.Courier, randomSalary(30000, 50000));
            yandex.needEmployee(VacancyType.Backend, randomSalary(100000, 110000));

            System.out.println("________________________________");
        }
    }

    static double randomSalary(double min, double max){
        Random random = new Random();
        return random.nextDouble(min, max);
    }

}
