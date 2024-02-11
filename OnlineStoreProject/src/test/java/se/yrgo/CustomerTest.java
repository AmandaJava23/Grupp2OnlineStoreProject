package se.yrgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void orderHistoryTest() {
        Customer customer = new Customer(1,
                "David", "david@david.com");
        assertEquals(0, customer.orderHistory.size());
        Product product = new Product();
        customer.placeOrder(product);
        assertEquals(1,customer.orderHistory.size());
    }

    @Test
    public void placeOrderTest(){
        Customer customer = new Customer(1,
                "David", "david@david.com");
        Product product = new Product();
        customer.placeOrder(product);
        assertEquals(1,customer.orderHistory.size());
    }
}
