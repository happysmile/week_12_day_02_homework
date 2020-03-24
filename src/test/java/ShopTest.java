import People.Cashier;
import People.Customer;
import Products.Category;
import Products.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Cashier Jane;
    Customer Ross;
    Customer Linda;
    Item pasta;
    Item mozzarella;
    Item toiletPaper;
    Item toothpaste;
    Shop lidl;
    ArrayList<Item> products;

    @Before()
    public void before(){
        Jane = new Cashier("Jane");
        Ross = new Customer("Ross", 26, 50);
        Linda = new Customer("Linda", 18, 55);
        mozzarella = new Item("mozzarella", Category.DAIRY, 1);
        pasta = new Item("pasta", Category.PASTA, 2);
        toiletPaper = new Item("toiler paper", Category.HYGIENE, 3);
        toothpaste = new Item("tooth paste", Category.HYGIENE, 1);
        lidl = new Shop(Ross, Jane);
        lidl.addItemToProducts(mozzarella);
        lidl.addItemToProducts(toiletPaper);
        lidl.addItemToProducts(pasta);
    }

    @Test
    public void canGetProducts(){
        assertEquals(3, lidl.getProducts().size());
    }

    @Test
    public void canAddItemToProducts(){
        assertEquals(3, lidl.getProducts().size());
        lidl.addItemToProducts(toothpaste);
        assertEquals(4, lidl.getProducts().size());
    }

    @Test
    public void canRemoveItemFromProducts(){
        assertEquals(3, lidl.getProducts().size());
        assertEquals(true, lidl.getProducts().contains(pasta));
        lidl.removeItemFromProducts(pasta);
        assertEquals(2, lidl.getProducts().size());
        assertEquals(false, lidl.getProducts().contains(pasta));
    }

    @Test
    public void canBuyAndSell(){
        assertEquals(3, lidl.getProducts().size());
        assertEquals(0, lidl.getTill(), 0);
        assertEquals(0, Ross.getBasket().size());
        assertEquals(50, Ross.getCash());
        Ross.addToBasket(pasta);
        Ross.addToBasket(mozzarella);
        lidl.purchase(Ross, Jane);
        assertEquals(1, lidl.getProducts().size());
        assertEquals(3, lidl.getTill(), 0);
        assertEquals(2, Ross.getBasket().size());
        assertEquals(47, Ross.getCash());
    }

    /* ATTENTION, STILL TO DO
    * 1. make a function in shop so that customer can add to basket only items in shop products
    * 2. make it that some products can't be sold to people aged under 21
    * 3. safety check that you can remove an item from shop products only if there is one
    * */




}