import java.util.HashMap;
public class ShoppingBasket {
    private Customer customer;
    private HashMap<Product, Integer> items = new HashMap<>();

    public ShoppingBasket(Customer customer) {
        this.customer = customer;

    }

    public void addItem(Product product, int quantity) {
        if (items.containsKey(product)) {
            int currentQuantity = items.get(product);
            items.put(product, currentQuantity + quantity);
        } else {
            items.put(product, quantity);
        }
    }

    public void removeItem(Product product, int quantity) {
        if (items.containsKey(product)) {
            int currentQuantity = items.get(product);
            if (currentQuantity <= quantity) {
                items.remove(product);
            } else {
                items.put(product, currentQuantity - quantity);
            }
        }
    }

    public HashMap<Product, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<Product, Integer> items) {
        this.items = items;
    }

    public Customer getCustomer(){
        return this.customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}