package receipt.service;

import admin.entity.Admin;
import customer.entity.Customer;
import io.entity.OutPut;
import java.util.List;
import payment.entity.Payment;

public class ReceiptService {

    public void displayReceipt(
        Customer customer,
        Admin admin,
        List<Payment> paymentList,
        long totalPrice,
        long totalQuantity
    ) {
        OutPut.displayReceiptHeader();
        for (Payment payment : paymentList) {
            OutPut.displayReceiptBody(payment);
        }
        OutPut.displayReceiptFooter(admin, customer, totalQuantity, totalPrice);
    }

}