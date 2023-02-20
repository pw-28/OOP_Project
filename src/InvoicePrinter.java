/**public interface InvoicePrinter {
    void printInvoice(Invoice invoice);
}

public class ConsoleInvoicePrinter implements InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice ID: " + invoice.getInvoiceId());
        System.out.println("Date: " + invoice.getDate());
        System.out.println("Billing Address: " + invoice.getBillingAddress());
        System.out.println("Invoice Items:");
        List<InvoiceItem> invoiceItems = invoice.getInvoiceItems();

    }
}

 **/