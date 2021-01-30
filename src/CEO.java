public class CEO extends Employee {
    private boolean hasCompanyCar;
    private boolean hasStocks;

    public CEO(String fio, int age, int salary, boolean hasCompanyCar, boolean hasStocks) {
        super(fio, age, salary);
        this.hasCompanyCar = hasCompanyCar;
        this.hasStocks = hasStocks;
    }

    public CEO() {

    }

    public void goPublic() {
        System.out.println("My employees are working on projects, everything will be settled soon, my dear clients!");
    }

    @Override
    public String print() {
        return "CEO's" + super.print() + hasCompanyCar + hasStocks;
    }

    public boolean getHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean getHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
}
