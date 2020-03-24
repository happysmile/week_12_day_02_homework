package People;

import Products.Item;

import java.util.ArrayList;

public class Customer extends Person {

    private int cash;
    private int age;
    private ArrayList<Item> basket;

    public Customer(String name, int age, int cash) {
        super(name);
        this.cash = cash;
        this.age = age;
        this.basket = new ArrayList<Item>();
    }

    public int getCash() {
        return this.cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Item> getBasket() {
        return basket;
    }

    public void addToBasket(Item item){
        this.basket.add(item);
    }

    public void pay(double amount){
        this.cash -= amount;
    }


}
