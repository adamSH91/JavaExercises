import classes.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Vehicle vehicle;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        vehicle = new Vehicle(2000, "V12");
    }

    @org.junit.jupiter.api.Test
    void getYearBuilt() {
        assertEquals(2000, vehicle.getYearBuilt());
    }

    @org.junit.jupiter.api.Test
    void setYearBuilt() {
    }

    @org.junit.jupiter.api.Test
    void getEngine() {
    }

    @org.junit.jupiter.api.Test
    void setEngine() {
    }
}