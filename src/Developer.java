public class Developer extends Employee {
    private String grades = "Middle";

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public Developer() {

    }

    public void writeCode() {
        if (this.grades.equals("Junior")) {
            System.out.println("The Developer does not meet the deadline");
        } else if (this.grades.equals("Middle")) {
            System.out.println("The code will be ready by the deadline");
        } else if (this.grades.equals("Senior")) {
            System.out.println("The code will be ready ahead of deadline");
        } else {
            System.out.println("I am beginner developer on an internship");
        }
    }

    @Override
    public String print() {
        return "Developer's" + super.print() + "level = " + grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
}
