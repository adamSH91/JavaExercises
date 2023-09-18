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

    public void toggleRooftop() {
        if (this.car.getClass() == Convertible.class) {
            Convertible convertible = (Convertible) this.car;
            convertible.setRooftopOpen(!convertible.getRooftopOpen());
        }
    }

    public void toggleSuperMode() {
        if (this.car.getClass() == Supercar.class) {
            Supercar supercar = (Supercar) this.car;
            supercar.setSuperModeOn(!supercar.isSuperModeOn());
        }
    }
}
