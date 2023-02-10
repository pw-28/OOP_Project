public class Customer extends Person {
    private String firstName;
    private String lastName;

    public Customer(String email, String password, String username, String firstName, String lastName) {
        super(email, password, username);
        this.firstName = firstName;
        this.lastName = lastName;
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