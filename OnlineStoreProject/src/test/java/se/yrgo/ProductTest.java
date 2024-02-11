package se.yrgo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void orderHistoryTest() {
        Customer customer = new Customer(1,
                "David", "david@david.com");
        assertEquals(0, customer.orderHistory.size());

        List<Product> testOrder = new ArrayList<>();
        testOrder.add(Product);
        customer.placeOrder(testOrder);
        assertEquals(1,customer.orderHistory.size());
    }
}
