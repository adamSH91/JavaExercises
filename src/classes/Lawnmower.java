package classes;

import interfaces.IDriveable;

public class Lawnmower implements IDriveable {
    private double milesMowed;
    private Position position;

    public Lawnmower(double miles, double x, double y) {
        this.milesMowed = miles;
        this.position = new Position(x, y);
    }

    @Override
    public void increaseMiles(double miles) {
        this.milesMowed += miles;
    }

    @Override
    public void setMiles(double miles) { this.milesMowed = miles; }

    @Override
    public double getMiles() {
        return milesMowed;
    }

    @Override
    public String getMake() {
        return null;
    }

    @Override
    public void setMake(String make) {

    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void setModel(String model) {

    }

    @Override
    public String getColour() {
        return null;
    }

    @Override
    public void setColour(String colour) {

    }

    @Override
    public String getReg() {
        return null;
    }

    @Override
    public void setReg(String reg) {

    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) { this.position = new Position(position.getX(), position.getY()); }

    public void mowLawn(double miles) {
        this.increaseMiles(miles);
    }
}
