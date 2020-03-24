package Products;

public class Item {
    String name;
    Category category;
    double price;

    public Item(String name, Category category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }




}
