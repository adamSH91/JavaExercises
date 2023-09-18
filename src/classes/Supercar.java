package classes;

public class Supercar extends Car {
    private boolean superModeOn;

    public Supercar(String colour, String reg, String model, String make, double miles,
                    double x, double y) {
        super(colour, reg, model, make, miles, x, y);
        this.superModeOn = false;
    }

    public boolean isSuperModeOn() {
        return superModeOn;
    }

    public void setSuperModeOn(boolean superModeOn) {
        this.superModeOn = superModeOn;
    }

    @Override
    public String toString() {
        return super.toString() + ", super mode" + (superModeOn ? "on": "off");
    }
}
