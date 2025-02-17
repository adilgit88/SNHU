package itemChoice;

public class ItemChoice1 {

    public static <T extends Comparable<T>>
    T chooseItem(T item1, T item2, T item3) {
        T chosenItem = item1;

        if (item2.compareTo(chosenItem) > 0) {
            chosenItem = item2;
        }
        if (item3.compareTo(chosenItem) > 0) {
            chosenItem = item3;
        }
        return chosenItem;
    }

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 9;
        Integer i3 = 4;

        Character c1 = 'o';
        Character c2 = 'v';
        Character c3 = 'z';

        String s1 = "purple";
        String s2 = "cyan";
        String s3 = "white";

        System.out.println(chooseItem(i1, i2, i3));
        System.out.println(chooseItem(c1, c2, c3));
        System.out.println(chooseItem(s1, s2, s3));
    }
}