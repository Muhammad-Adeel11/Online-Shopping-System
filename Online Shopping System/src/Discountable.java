import java.util.ArrayList;

interface Discountable {
    double applyDiscount(double originalPrice);
}

class OnlineShoppingSystem implements Discountable {
ArrayList<Product> products = new ArrayList<>();
   
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * 0.10;
    }
}