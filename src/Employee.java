public class Employee {
    private String fio;
    private int age;
    private int salary;
    Employee [] employees;

    public Employee(String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }


    public String print() {
        return " " +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                "$ ";
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
