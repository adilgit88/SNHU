package car;

public class ElectricCar extends Car {
    protected String range;

    void setRange(String newRange) {
        range = newRange;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + range + ")";
    }
}