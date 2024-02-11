package se.yrgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart cart = new ShoppingCart();
    private Product product1 = new Product();
    private Product product2 = new Product();

    @Test
    public void addProductTest() {
        cart.addProductToCart(product1);
        assertEquals(1, cart.getShoppingCart().size());
        assertTrue(cart.getShoppingCart().contains(product1));
    }

    @Test
    public void removeProductTest() {
        cart.removeProductFromCart(product1);
        assertEquals(0, cart.getShoppingCart().size());
        assertFalse(cart.getShoppingCart().contains(product1));
    }

    public void totalValueTest() {
        cart.addProductToCart(product1);
        cart.addProductToCart(product2);
        assertEquals(100, cart.valueOfCart());

        // pris på produkterna?
    }

    public void seeCartTest() {

    }

}