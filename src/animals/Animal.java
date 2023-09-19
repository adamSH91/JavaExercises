package animals;

public class Animal {
    private String name;
    private double weight;
    private String type;
    private String diet;

    public Animal(String name, double weight, String type, String diet) {
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String toString() {
        return "Name: " + this.name + ", weight: " + this.weight + ", type: " +
                this.type + ", diet: " + this.diet + ".";
    }
}
