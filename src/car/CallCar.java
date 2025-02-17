package car;

public class CallCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        ElectricCar electricCar = new ElectricCar();

        myCar.setBrand("Chevrolet");
        myCar.setModel("Malibu");
        electricCar.setBrand("Audi");
        electricCar.setModel("e-Tron");
        electricCar.setRange("240 miles");

        System.out.println(myCar);
        System.out.println(electricCar);
    }
}