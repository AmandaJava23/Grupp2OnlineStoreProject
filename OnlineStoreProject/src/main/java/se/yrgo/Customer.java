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

    /**
     * all prodcuts are put into the orderHistroy list and can be shown here using
     * this method.
     * @return a formatted string with all the information
     */
    public String orderHistory(){
        if(orderHistory.isEmpty()){
            return "No history to be shown";
        }
        return String.format("Order History: %nName: %s%nEmail: %s%n" +
                "Items: %s&n",name,email,orderHistory);
    }

    /**
     * Method for placing orders.
     * add a Product into a list.
     *
     * @param product
     * @throws IllegalArgumentException
     */
    public void placeOrder(Product product) throws IllegalArgumentException  {
        if(product == null){
            throw new IllegalArgumentException("Product doens't exist!");
        }
        orderHistory.add(product);
    }
}
