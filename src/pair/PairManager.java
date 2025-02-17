package pair;

public class PairManager {
    public static void main(String[] args) {
        Pair<Integer> twoInts = new Pair<Integer>(41, 10);
        Pair<Double> twoDbls = new Pair<Double>(40.8, 50.7);
        Pair<Character> twoChars = new Pair<Character>('g', 'p');

        System.out.println(twoInts.chooseItem());
        System.out.println(twoDbls.chooseItem());
        System.out.println(twoChars.chooseItem());
    }
}