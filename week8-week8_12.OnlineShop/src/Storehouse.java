import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();
    private static final int PRICE_NOT_FOUND = -99;

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (!prices.containsKey(product)) {
            return PRICE_NOT_FOUND;
        }

        return prices.get(product);
    }

    public int stock(String product) {
        if (!stocks.containsKey(product)) {
            return 0;
        }

        return stocks.get(product);
    }

    public boolean take(String product) {
        if (!stocks.containsKey(product)) {
            return false;
        }
        
        int amount = stock(product);
        if (amount == 0) {
            return false;
        }

        stocks.put(product, amount - 1);
        return true;
    }

    public Set<String> products() {
        return prices.keySet();
    }
}
