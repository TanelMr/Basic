package Week8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Storehouse() {
        products = new HashMap<>();
        stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
       this.products.put(product, price);
       this.stocks.put(product, stock);
    }

    public int price(String product){
        return this.products.getOrDefault(product, -99);
    }

    public int stock(String product){
        return this.stocks.getOrDefault(product, 0);
    }

    public boolean take(String product){
        if(this.stocks.containsKey(product)){
            if(this.stocks.get(product) > 0){
                this.stocks.put(product, this.stocks.get(product) - 1);
                return true;
            }
            return false;
        }
        return false;
    }

    public Set<String> products(){
        return this.products.keySet();
    }
}
