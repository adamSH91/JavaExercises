package classes;

import interfaces.IFlyable;

public class Plane extends Vehicle implements IFlyable {
    private double wingspan;
    private boolean gearsDown;
    private double throttleSpeed;
    private double miles;

    public Plane(int yearBuilt, String engine, double wingspan, boolean gearsDown, double throttleSpeed) {
        super(yearBuilt, engine);
        this.wingspan = wingspan;
        this.gearsDown = gearsDown;
        this.throttleSpeed = throttleSpeed;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public boolean getGearsDown() {
        return gearsDown;
    }

    public void setGearsDown(boolean gearsDown) {
        this.gearsDown = gearsDown;
    }

    public double getThrottleSpeed() {
        return throttleSpeed;
    }

    public void setThrottleSpeed(double throttleSpeed) {
        this.throttleSpeed = throttleSpeed;
    }

    public void increaseMiles(double miles) {
        this.miles += miles;
    }

    @Override
    public void fly(double miles) {
        this.increaseMiles(miles);
    }
}
