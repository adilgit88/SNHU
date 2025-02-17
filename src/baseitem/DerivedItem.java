package baseitem;

public class DerivedItem extends BaseItem {
    private String firstName;

    public void setFirstName(String providedName) {
        firstName = providedName;
    }

    @Override
    public void printItem() {
        System.out.print("First and last name: ");
        System.out.println(firstName + " " + lastName);
    }
}

