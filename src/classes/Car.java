package classes;

public class Car {
    private String colour;
    private String reg;
    private String model;
    private String make;
    private double miles;
    private Position position;

    public Car(String colour, String reg, String model, String make, double miles, double x, double y) {
        this.colour = colour;
        this.reg = reg;
        this.model = model;
        this.make = make;
        this.miles = miles;
        this.position = new Position(x, y);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getMiles() {
        return miles;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public void increaseMiles(double miles) {
        this.miles += miles;
    }

    @Override
    public String toString() {
        return "Car colour: " + this.colour + ", reg: " + this.reg + ", make: " +
        this.make + ", model: " + this.model + ", miles: " + this.miles + ", position: (" +
                this.position.getX() + ", " + this.position.getY() + ")";
    }
}
