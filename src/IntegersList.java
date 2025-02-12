import java.util.ArrayList;

public class IntegersList {
    public static void main(String [] args) {
        ArrayList<Integer> userVals = new ArrayList<Integer>();
        int i;

        userVals.add(1);
        userVals.add(5);
        userVals.add(9);

        userVals.set(2, userVals.get(1));
        userVals.set(1, userVals.get(2));

        for (i = 0; i < userVals.size(); ++i) {
            System.out.println(userVals.get(i));
        }
    }
}