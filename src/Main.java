import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Допустим у нас в программе есть класс Employee, и у него есть наследники Programmer, QAEngineer и Manager.
        У класса Programmer есть 2 наследника BackEnd Programmer и FrontEnd Programmer. Вам необходимо реализовать класс Team,
        который содержал бы в себе менеджера и список работников одной специализации, т.е.
        например  Programmer или QAEngineer или BackEnd Programmer или FrontEnd Programmer
        Реализуйте метод добавления работника в команду. Естественно, в команду  Programmer не должно быть возможным добавить QAEngineer
         */

        Manager manager = new Manager("Апостол Пётр");

        Team<Programmer> programmerTeam = new Team<>(manager);
        Team<QAEngineer> qaEngineerTeam = new Team<>(manager);
        Team<Manager> managerTeam = new Team<>(manager);

        Manager manager1 = new Manager("Michael");

        FrontEnd programmer1 = new FrontEnd("Jack");
        FrontEnd programmer2 = new FrontEnd("John");
        BackEnd programmer3 = new BackEnd("Niko");
        BackEnd programmer4 = new BackEnd("Raf");

        QAEngineer qaEngineer1 = new QAEngineer("Lena");
        QAEngineer qaEngineer2 = new QAEngineer("Miko");
        QAEngineer qaEngineer3 = new QAEngineer("Oleg");

        programmerTeam.addEmployee(programmer3);
        programmerTeam.addEmployee(programmer4);
        programmerTeam.addEmployee(programmer1);
        programmerTeam.addEmployee(programmer2);

        qaEngineerTeam.addEmployee(qaEngineer2);

        managerTeam.addEmployee(manager1);

        System.out.println(programmerTeam);
    }
}