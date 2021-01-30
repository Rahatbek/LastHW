public class MainInheritance {

    public static void main(String[] args) {
        Specialist harryPotter = new Specialist("Harry Potter",23,600,2);
        Specialist hermioneGranger = new Specialist("Hermione Granger", 22, 700,3);
        Specialist ronWeaslye = new Specialist("Ron Weasley", 24, 500,1);

        Developer minervaMcGonagall = new Developer("Minerva McGonagall", 34, 1500, "Middle");
        Developer doloresUmbridge = new Developer("Dolores Umbridge", 45, 2500, "Senior?");
        Developer severusSnape = new Developer("Severus Snape", 50, 3000, "Junior");
        Developer rolandaTryuk = new Developer("Rolanda Tryuk", 39, 1400, "Senior");

        Manager rebeusHagrid = new Manager("Rebeus Hagrid", 38, 1000, true);
        Manager masterDobby = new Manager("master Dobby", 25, 900, false);

        CEO albusDumbldore = new CEO("Albus Dumbledore", 85, 4000, true, true);

        Employee[] employees = new Employee[]{harryPotter,hermioneGranger,ronWeaslye,minervaMcGonagall,doloresUmbridge,severusSnape,
        rolandaTryuk,rebeusHagrid,masterDobby,albusDumbldore};
        for (int i = 0; i < employees.length; i++)
//        System.out.println(employees[i].print());

        System.out.println(harryPotter.print());
        harryPotter.workWithClients();
        System.out.println("------------------");
        System.out.println(hermioneGranger.print());
        hermioneGranger.workWithClients();
        System.out.println("------------------");
        System.out.println(ronWeaslye.print());
        ronWeaslye.workWithClients();
        System.out.println("------------------");
        System.out.println(minervaMcGonagall.print());
        minervaMcGonagall.writeCode();
        System.out.println("------------------");
        System.out.println(doloresUmbridge.print());
        doloresUmbridge.writeCode();
        System.out.println("------------------");
        System.out.println(severusSnape.print());
        severusSnape.writeCode();
        System.out.println("------------------");
        System.out.println(rolandaTryuk.print());
        rolandaTryuk.writeCode();
        System.out.println("------------------");
        System.out.println(rebeusHagrid.print());
        rebeusHagrid.writeProcedures();
        System.out.println("------------------");
        System.out.println(masterDobby.print());
        masterDobby.writeProcedures();
        System.out.println("------------------");
        System.out.println(albusDumbldore.print());
        albusDumbldore.goPublic();
        //Intelligence is the ability to avoid doing work, but in a way that gets it done.

    }
}
