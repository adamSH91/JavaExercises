package classes;

public class Convertible extends Car {
    private boolean rooftopOpen;

    public Convertible(String colour, String reg, String model, String make, double miles,
                       double x, double y) {
        super(colour, reg, model, make, miles, x, y);
        this.rooftopOpen = false;
    }

    public boolean getRooftopOpen() {
        return rooftopOpen;
    }

    public void setRooftopOpen(boolean rooftopOpen) {
        this.rooftopOpen = rooftopOpen;
    }

    @Override
    public String toString() {
        return super.toString() + ", rooftop " + (rooftopOpen ? "open" : "closed");
    }
}
