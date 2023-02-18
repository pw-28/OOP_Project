/
import java.util.Date;
import java.util.UUID;

public class Order {
    private UUID id;
    private Customer customer;
    private Address deliveryAddress;
    private Address billingAddress;
    private Date creationDate;
    private Date approximateArrivalDate;
    private boolean declined;
    private Administrator declinedBy;

    public Order(Customer customer, Address deliveryAddress, Address billingAddress) {
        this.id = UUID.randomUUID();
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
        this.billingAddress = billingAddress;
        this.creationDate = new Date();
        this.approximateArrivalDate = null;
        this.declined = false;
        this.declinedBy = null;
    }

    public Order(Invoice invoice, Customer customer) {
    }
    //Constructor
    //delete Invoice

    public UUID getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
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
}
