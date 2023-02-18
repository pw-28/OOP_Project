import java.util.ArrayList;
import java.util.List;
public class Shop {
   //public static void main(String[] args) {
       //   System.out.println();
  // }
    //Autoboxing
        List<Customer> customers = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        List<ShoppingBasket> baskets = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        public void addCustomer(Customer customer) {
            customers.add(customer);
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        //add products?


        public ShoppingBasket createShoppingBasket() {
            ShoppingBasket basket = new ShoppingBasket();
            baskets.add(basket);
            return basket;
        }

        public Invoice createInvoice(ShoppingBasket basket) {
            Invoice invoice = new Invoice(basket);
            invoices.add(invoice);
            return invoice;
        }

        public Order placeOrder(Invoice invoice, Customer customer) {
            Order order = new Order(invoice, customer);
            orders.add(order);
            return order;
        }


}
