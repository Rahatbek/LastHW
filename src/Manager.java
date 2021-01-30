public class Manager extends Employee {
    private boolean hasStocks;

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio,age,salary);
        this.hasStocks = hasStocks;
    }

    public Manager() {

    }

    public void writeProcedures() {
        if (this.hasStocks == false) {
            System.out.println("Manager lack creativity");
        }else if (this.hasStocks == true){
            System.out.println("Manager working");
        }
    }

    @Override
    public String print() {
        return "Manager's" + super.print() + hasStocks;
    }

    public boolean isHasStocks() {
        if (hasStocks = true) {
            System.out.println("Writing procedures");
            return hasStocks;
        }else
            System.out.println("Don't writing procedures");
            return false;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
}
