package classes;

public class Convertible extends Car {
    private boolean rooftopOpen;

    public Convertible() {
        super("Red", "REG", "Enzo", "Ferrari", 0.0, 0.0, 0.0);
        this.rooftopOpen = false;
    }

    public boolean isRooftopOpen() {
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
