/**import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class InvoiceGenerator {

    public static Invoice createInvoice(Order order) throws Exception {
        if (order.isDeclined()) {
            throw new Exception("Cannot generate invoice for declined order");
        }

        Date currentDate = new Date();
        UUID invoiceId = UUID.randomUUID();
        Address billingAddress = order.getBillingAddress();
        //create getter

        List<InvoiceItem> invoiceItems = new ArrayList<>();
        //create Invoice in Shop

        for () {
            );
        }


        return new Invoice(currentDate, invoiceId, billingAddress, invoiceItems, grandTotal);
    }
}
**/