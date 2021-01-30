public class Specialist extends Employee {
    private int levels;

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public Specialist() {

    }

    public void workWithClients() {
        if(this.levels == 2) {
            System.out.println("Sorry all the specialists are busy, please wait or cals another time!");
        }else if(this.levels == 3) {
            System.out.println("The specialist will answer you in three minutes");
        }else {
            System.out.println("Hello, my name is Ron Weasley, can I help you");
        }
    }

    @Override
    public String print() {
        return "Specialist's" + super.print() + "developer's level = " + levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }
}
