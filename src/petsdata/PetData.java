package petsdata;
public class PetData extends AnimalData {
    private int idNum;

    public void setID(int petID) {
        idNum = petID;
    }

    // printAll() method for PetData
    public void printAll() {
        // Call the printAll() method from the base class (AnimalData)
        super.printAll();
        // Append the pet's ID to the output
        System.out.print(", ID: " + idNum);
    }
}
