import java.util.HashMap;
public class Customer extends Person {
    private String firstName;
    private String lastName;

    private HashMap<String,Address> addressMap = new HashMap();

    public Customer(String email, String password, String username, String firstName, String lastName, Address billing, Address delivery) {
        super(email, password, username);
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressMap.put("Billing", billing);
        this.addressMap.put("Delivery", delivery);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}