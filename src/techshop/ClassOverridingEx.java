package techshop;

public class ClassOverridingEx {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();

        myLaptop.setComputerStatus("25%", "connected", "bad");

        myLaptop.printStatus();

    }
}