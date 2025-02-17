package iitemM;

public class ItemManager {
    public static void main(String[] args) {
        Item<Integer> itemInt = new Item<Integer>(20);
        Item<Character> itemChar = new Item<Character>('q');

        itemInt.updateCount(20);
        itemInt.updateCount(2);

        itemChar.updateCount('x');
        itemChar.updateCount('q');
    }
}