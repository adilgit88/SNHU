package BookInfo;
public class Encyclopedia extends Book {
    // Declare private fields for edition and numVolumes
    private String edition;
    private int numVolumes;

    // Mutator methods (setters)
    public void setEdition(String userEdition) {
        edition = userEdition;
    }

    public void setNumVolumes(int userNumVolumes) {
        numVolumes = userNumVolumes;
    }

    // Accessor methods (getters)
    public String getEdition() {
        return edition;
    }

    public int getNumVolumes() {
        return numVolumes;
    }

    // Override printInfo() method to print additional information for Encyclopedia
    @Override
    public void printInfo() {
        super.printInfo(); // Call the printInfo method of the Book class
        System.out.println("   Edition: " + getEdition());
        System.out.println("   Number of Volumes: " + getNumVolumes());
    }
}
