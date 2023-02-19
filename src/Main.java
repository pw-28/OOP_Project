public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // Adressen erzeugen
        Address billing = shop.createAddress("Austria", "Jörgerstraße","35", "1170" );
        Address delivery = shop.createAddress("Austria", "Jörgerstraße","35", "1170");

        // Customer anlegen
        Customer customer1 = shop.createCustomer("peter@hallo.de","123456","pw", "Peter", "Wild",billing,delivery);

        // Administrator anlegen
        Administrator administrator1 = shop.createAdministrator("jakob@servus.de", "654321","jk","Chief");

        // Produkte anlegen
        Product regenschirm = shop.createProduct("Grüner Regenschirm", "grün", 49.99);
        Product gummistiefel = shop.createProduct("Gelbe Gummistiefel", "gelb", 69.99);

        // Basket für Kunden anlegen
        ShoppingBasket shoppingBasket = shop.createShoppingBasket(customer1);
        shop.addProductToBasket(shoppingBasket,regenschirm,3);
        shop.addProductToBasket(shoppingBasket, gummistiefel,1);
        System.out.println(shoppingBasket.getItems());
        shop.removeProductFromBasket(shoppingBasket,regenschirm,1);
        System.out.println(shoppingBasket.getItems());

        //Order erzeugen
        Order order1 = shop.createOrder(shoppingBasket);
        System.out.println(order1.getPrice());
        System.out.println(order1.getId());
        System.out.println(order1.isDeclined());
        shop.declineOrder(order1, administrator1);
        System.out.println(order1.isDeclined());

    }
}