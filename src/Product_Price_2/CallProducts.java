package Product_Price_2;

public class CallProducts {
    public static void main(String[] args) {
        Products allProducts = new Products();

        allProducts.inputProducts();
        allProducts.printAfterDiscount(1);
    }
}