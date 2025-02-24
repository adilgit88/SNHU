package PrintMedia1;
public class PrintMedia {
    public static void main(String[] args) {
        Media med = new Media();

        med.setSinger("John Mayer");
        med.setName("Gravity");

        med.printName();
        med.printSinger();
    }
}