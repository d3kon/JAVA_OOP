package hw7.observer;

public enum VacancyType {
    JavaProgrammer("Java-программист"),
    Teacher("Преподаватель"),
    Courier("Курьер"),
    Frontend("Frontend-программист"),
    Backend("Backend-программист");

    private String vacancy;
    VacancyType(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getVacancy() {
        return vacancy;
    }
}
