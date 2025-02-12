public class CostCalculator {
    public static int calculateCost(int age, int units) {
        int cost;
        if (age > 16 && age <= 25) {
            if (units > 5) {
                cost = (units - 5) * 100;
            }
            else {
                cost = 0;
            }
        }
        else {
            if (units < 4) {
                cost = units * 100;
            }
            else {
                cost = (units - 3) * 400 + 200;
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int costReturned = calculateCost(23, 13);
        System.out.println(costReturned);
    }
}