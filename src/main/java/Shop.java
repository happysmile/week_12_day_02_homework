import People.Cashier;
import People.Customer;
import Products.Item;

import java.util.ArrayList;

public class Shop {
    Customer customer;
    Cashier cashier;
    ArrayList<Item> products;
    double till;


    public Shop(Customer customer, Cashier cashier) {
        this.customer = customer;
        this.cashier = cashier;
        this.products = new ArrayList<Item>();
        this.till = 0;
    }

    public ArrayList<Item> getProducts() {
        return this.products;
    }

    public double getTill() {
        return this.till;
    }

    public void addMoneyToTill(double amount){
        this.till += amount;
    }

    public void addItemToProducts(Item item){
        this.products.add(item);
    }

    public void removeItemFromProducts(Item item){
        this.products.remove(item);
    }

    public void purchase(Customer customer, Cashier cashier){
        double total = cashier.calculateTotal(customer.getBasket());
        customer.pay(total);
        this.addMoneyToTill(total);
        for (Item item : customer.getBasket()){
            this.removeItemFromProducts(item);
        }
    }

}
