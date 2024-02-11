package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Customer ID;
    private String name;
    private String email;
    List<List<Product>> orderHistory;
    public Customer(Customer ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }
    public Customer getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public String orderHistory(){
        return String.format("Order History: %nName: %s%nEmail: %s%n" +
                "Items: %s&n",name,email,orderHistory);
    }
    public void placeOrder(List<Product> product){
        orderHistory.add(product);
    }
}
