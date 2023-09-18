package classes;

public class Driver {
    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive(double miles, double newX, double newY) {
        this.car.increaseMiles(miles);
        this.car.setPosition(new Position(newX, newY));
    }
}
