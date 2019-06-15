import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {

    private Map<String, Purchase> purchases = new HashMap<String, Purchase>();

    public void add(String product, int price) {
        Purchase purchase = purchases.get(product);

        if (purchase == null) {
            purchase = new Purchase(product, 0, price);
        }

        purchase.increaseAmount();
        purchases.put(product, purchase);
    }

    public int price() {
        int price = 0;

        for (Purchase purchase: purchases.values()) {
            price += purchase.price();
        }

        return price;
    }

    public void print() {
        for (Purchase purchase: purchases.values()) {
            System.out.println(purchase);
        }
    }
}