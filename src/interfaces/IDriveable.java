package interfaces;
import classes.Position;

public interface IDriveable {
    public void increaseMiles(double miles);

    public void setMiles(double miles);

    public double getMiles();

    public String getMake();

    public void setMake(String make);

    public String getModel();

    public void setModel(String model);

    public String getColour();

    public void setColour(String colour);

    public String getReg();

    public void setReg(String reg);

    public Position getPosition();

    public void setPosition(Position position);
}
