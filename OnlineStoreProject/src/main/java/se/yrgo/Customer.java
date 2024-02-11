package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int CustomerID;
    private String name;
    private String email;
    List<Product> orderHistory;
    public Customer(int CustomerID, String name, String email) {
        this.CustomerID = CustomerID;
        this.name = name;
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }
    public int getCustomerID() {
        return CustomerID;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public String orderHistory(){
        if(orderHistory.isEmpty()){
            return "No history to be shown";
        }
        return String.format("Order History: %nName: %s%nEmail: %s%n" +
                "Items: %s&n",name,email,orderHistory);
    }
    public void placeOrder(Product product){
        orderHistory.add(product);
    }
}
