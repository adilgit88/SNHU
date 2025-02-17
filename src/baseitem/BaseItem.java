package baseitem;
// ===== Code from file BaseItem.java =====
public class BaseItem {
    protected String lastName;

    public void setLastName(String providedName) {
        lastName = providedName;
    }

    // Define printItem() method for BaseItem
    public void printItem() {
        System.out.println("Last name: " + lastName);
    }
}


