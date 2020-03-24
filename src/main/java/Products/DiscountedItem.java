package Products;

public class DiscountedItem extends Item implements IDiscounted {

    int discountPercentage;

    public DiscountedItem(String name, Category category, double price, int discountPercentage) {
        super(name, category, price);
        this.discountedPrice(discountPercentage);
    }


    public void discountedPrice(int percentage) {
        this.price -= (this.price * percentage)/100;
    }





}
