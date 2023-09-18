import classes.*;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Blue", "REG", "Audi", "Q7", 0.0, 20.0, 30.0);
        Driver driver = new Driver(car);

        car.setMiles(100.0);
        car.setColour("White");
        car.setReg("REG1");
        car.setMake("Volkswagen");
        car.setModel("Polo");

        System.out.println(car.getMiles());
        System.out.println(car.getColour());
        System.out.println(car.getReg());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        driver.drive(200.0, 100.0, 50.0);
        System.out.println(driver.getCar().getMiles());
        System.out.println(driver.getCar().getPosition().getX());
        System.out.println(driver.getCar().getPosition().getY());


    }
}