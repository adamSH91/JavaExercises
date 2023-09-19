package animals;

public class Aquatic extends Animal{
    private String waterType;

    public Aquatic(String name, double weight, String type, String diet, String waterType) {
        super(name, weight, type, diet);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public String toString() {
        return super.toString() + " I am also an aquatic animal.";
    }
}
