package classes;

public class Vehicle {
    private int yearBuilt;
    private String engine;

    public Vehicle(int yearBuilt, String engine) {
        this.yearBuilt = yearBuilt;
        this.engine = engine;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
