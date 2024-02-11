package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addProductToCart(Product product) {
        shoppingCart.add(product);
    }

    public void removeProductFromCart(Product product) {
        shoppingCart.remove(product);
    }

    public double valueOfCart() {
        double valueOfCart = 0;
        for (Product product : shoppingCart) {
            valueOfCart = valueOfCart + product.getValue();
        }
        return valueOfCart;
    }

    public void showShoppingCart() {
        for (Product product : shoppingCart) {
            System.out.println(product);
        }
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public String toString() { return "Shopping Cart: " + shoppingCart;
    }
}