package instrument;

public class StringInstrument extends Instrument {
    // Declare private fields: numStrings, numFrets
    private int numStrings;
    private int numFrets;

    // Define mutator methods
    public void setNumOfStrings(int userNumStrings) {
        numStrings = userNumStrings;
    }

    public void setNumOfFrets(int userNumFrets) {
        numFrets = userNumFrets;
    }

    // Define accessor methods
    public int getNumOfStrings() {
        return numStrings;
    }

    public int getNumOfFrets() {
        return numFrets;
    }

    // Override printInfo() method to include information about numStrings and numFrets
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Number of strings: " + numStrings);
        System.out.println("   Number of frets: " + numFrets);
    }
}
