package animals;

public class Amphibian extends Aquatic{
    private double timeOnLand;

    public Amphibian(String name, double weight, String type, String diet,
                     String waterType, double timeOnLand) {
        super(name, weight, type, diet, waterType);
        this.timeOnLand = timeOnLand;
    }

    public double getTimeOnLand() {
        return timeOnLand;
    }

    public void setTimeOnLand(double timeOnLand) {
        this.timeOnLand = timeOnLand;
    }

    public String toString() {
        return super.toString() + "In addition, I am an amphibian.";
    }
}
