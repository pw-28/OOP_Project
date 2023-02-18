public class Shop {
    public Customer createCustomer(String email, String password, String username, String firstName, String lastName, Address billing, Address delivery){
        return new Customer(email,password,username,firstName,lastName,billing,delivery);
    }

    public  Address createAddress(String country, String streetName, String streetNumber, String zipCode){
        return  new Address(country,streetName,streetNumber,zipCode);
    }

    public  Administrator createAdministrator(String email, String password, String username, String jobTitle){
        return new Administrator(email,password,username,jobTitle);
    }

    public Product createProduct(String name, String description, double price){
        return new Product(name,description,price);
    }

    public ShoppingBasket createShoppingBasket(Customer customer){
        return new ShoppingBasket(customer);
    }
    public void addProductToBasket(ShoppingBasket shoppingBasket, Product product, Integer amount){
        shoppingBasket.addItem(product,amount);
    }
    public void removeProductFromBasket(ShoppingBasket shoppingBasket, Product product, Integer amount){
        shoppingBasket.removeItem(product,amount);
    }
    public Order createOrder(ShoppingBasket shoppingBasket){
        return new Order(shoppingBasket);
    }
    public void declineOrder(Order order, Administrator administrator){
        order.decline(administrator);
    }
}
