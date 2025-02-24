package printMedia2;
public class PrintMedia {
    public static void main(String[] args) {
        Episode ep1 = new Episode();
        Song song1 = new Song();

        ep1.setDuration(80);
        song1.setDuration(1, 35);

        ep1.printDuration();
        song1.printDuration();
    }
}