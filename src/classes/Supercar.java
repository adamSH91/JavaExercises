package classes;

public class Supercar extends Car {
    private boolean superModeOn;

    public Supercar() {
        super("Black", "REG", "C-class", "Mercedes", 0.0, 0.0, 0.0);
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
