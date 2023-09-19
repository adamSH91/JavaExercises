package classes;

import interfaces.IDriveable;

public class Car implements IDriveable {
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
    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String getReg() {
        return reg;
    }

    @Override
    public void setReg(String reg) {
        this.reg = reg;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }
    @Override
    public double getMiles() {
        return miles;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
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
