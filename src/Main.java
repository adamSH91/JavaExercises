import animals.*;
import classes.*;
public class Main {
    public static void main(String[] args) {
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

    }
}