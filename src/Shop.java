

public class Shop {

    public class Shop {
        public List<Customer> customers;
        public List<Product> products;
        public List<ShoppingBasket> shoppingBaskets;
        private List<Invoice> invoices;

        public Shop() {
            customers = new ArrayList<>();
            products = new ArrayList<>();
            shoppingBaskets = new ArrayList<>();
            invoices = new ArrayList<>();
        }

        public void addCustomer(Customer customer) {
            customers.add(customer);
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public ShoppingBasket createShoppingBasket(Customer customer) {
            ShoppingBasket basket = new ShoppingBasket(customer);
            shoppingBaskets.add(basket);
            return basket;
        }

        public Invoice createInvoice(ShoppingBasket basket) {
            Invoice invoice = new Invoice(basket);
            invoices.add(invoice);
            return invoice;
        }

        public void placeOrder(Invoice invoice) {
            // Place the order
        }
    }
}
