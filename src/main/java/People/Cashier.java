package People;

import Products.Item;

import java.util.ArrayList;

public class Cashier extends Person{

    public Cashier(String name) {
        super(name);
    }

    public boolean isCustomerOver21(Customer customer){
        if(customer.getAge()>=21){
            return true;
        } else {
            return false;
        }
    }

    public double calculateTotal(ArrayList<Item> basket){
        int total = 0;
        for(Item item : basket){
            total += item.getPrice();
        }
        return total;
    }

    public void takePayment(Customer customer, int total){
        customer.pay(total);
    }

}
