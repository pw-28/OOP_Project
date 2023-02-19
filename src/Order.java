import java.util.*;
public class Order {
    private UUID id;
    private Customer customer;
    private Date creationDate;
    private Date approximateArrivalDate;
    private boolean declined;
    private Administrator declinedBy;
    private double price = 0.0;
    private HashMap<Product, Integer> items = new HashMap<>();

    public Order(ShoppingBasket shoppingBasket) {
        this.id = UUID.randomUUID();
        this.customer = shoppingBasket.getCustomer();
        this.creationDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(creationDate);
        c.add(Calendar.DATE, 7);
        this.approximateArrivalDate = c.getTime();
        this.declined = false;
        this.declinedBy = null;
        this.items = shoppingBasket.getItems();

        for (Map.Entry<Product,Integer> e : items.entrySet()){
            this.price = this.price + e.getValue()* e.getKey().getPrice();
        }

    }


    public UUID getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getApproximateArrivalDate() {
        return approximateArrivalDate;
    }

    public void setApproximateArrivalDate(Date approximateArrivalDate) {
        this.approximateArrivalDate = approximateArrivalDate;
    }

    public boolean isDeclined() {
        return declined;
    }

    public void setDeclined(boolean declined) {
        this.declined = declined;
    }

    public Administrator getDeclinedBy() {
        return declinedBy;
    }

    public void setDeclinedBy(Administrator declinedBy) {
        this.declinedBy = declinedBy;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void decline(Administrator administrator){
        this.declinedBy = administrator;
        this.declined = true;
    }
}
