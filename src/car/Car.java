package car;
public class Car {
    protected String brand;
    protected String model;

    void setBrand(String carBrand) {
        brand = carBrand;
    }

    void setModel(String carModel) {
        model = carModel;
    }

    @Override
    public String toString() {
        return model + " - " + brand;
    }
}