import animals.*;
import classes.*;
import interfaces.IDriveable;
import interfaces.IFlyable;

public class Main {
    public static void main(String[] args) throws Exception {
        Supercar car = new Supercar("Blue", "REG", "Audi", "Q7", 0.0, 20.0, 30.0);
        Convertible convertible = new Convertible("Red", "REG", "C-class", "Mercedes", 0.0, 0.0, 0.0);
        Driver driver = new Driver(car);
        Driver driver2 = new Driver(convertible);

        car.setMiles(100.0);
        car.setColour("White");
        car.setReg("REG1");
        car.setMake("Volkswagen");
        car.setModel("Polo");
        driver.toggleSuperMode();
        driver2.toggleRooftop();

        System.out.println(car.getMiles());
        System.out.println(car.getColour());
        System.out.println(car.getReg());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        driver.drive(200.0, 100.0, 50.0);
        System.out.println(driver.getCar().getMiles());
        System.out.println(driver.getCar().getPosition().getX());
        System.out.println(driver.getCar().getPosition().getY());

        /*
        Amphibian[] amphibians = {new Amphibian("frog", 1.0, "amphibian",
                "carnivore", 100.0),
                new Amphibian("salamander", 3.0, "amphibian",
                "carnivore", 200.0),
                new Amphibian("toad", 4.0, "amphibian",
                "carnivore", 300.0)
        };

        for (Amphibian amphibian: amphibians) {
            System.out.println(amphibian.toString());
        }
        */

        Lawnmower lawnMower = new Lawnmower(0.0, 0.0, 0.0);
        lawnMower.mowLawn(2.0);
        System.out.println(lawnMower.getMiles());

        IFlyable plane = new Plane(2010, "engine", 50.0, true, 100.0);
        plane.fly(100.0);

        Bank bank = new Bank();
        bank.addAccount(new BankAccount("Account 1", 1, 0.0));
        bank.addAccount(new BankAccount("Account 2", 2, 10.0));
        bank.addAccount(new BankAccount("Account 3", 100, 100.0));

        System.out.println(bank.getBankAccountByIndex(0));
        bank.printAllBankAccounts();

        System.out.println("----");

        bank.removeBankAccountByIndex(2);
        bank.printAllBankAccounts();

        System.out.println("----");

        bank.removeBankAccountByAccountNumber(1);
        bank.printAllBankAccounts();

        System.out.println("----");

        bank.addAccount(new BankAccount("Account 1", 1, 0.0));
        bank.addAccount(new BankAccount("Account 3", 100, 100.0));
        System.out.println(bank.calculateBalanceAverageForAllAccounts());


    }
}