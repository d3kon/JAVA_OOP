package hw3;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee{

    private int workingDays;
    private int workingHour;

    {
        workingDays = 20;
        workingHour = 8;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return workingHour * workingDays * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий-Фрилансер; %d лет; Заработная плата за 1 час работы: %.2f (руб.), " +
                        "Заработная плата за %d рабочих дней: %.2f (руб.)",
                surname, name, age, salary, workingDays, calculateSalary());
    }
}
