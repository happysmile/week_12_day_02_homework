import People.Cashier;
import People.Customer;
import Products.Category;
import Products.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashierTest {

    Cashier Jane;
    Customer Ross;
    Customer Linda;
    Item pasta;
    Item mozzarella;
    Item toiletPaper;

    @Before()
    public void before(){
        Jane = new Cashier("Jane");
        Ross = new Customer("Ross", 26, 50);
        Linda = new Customer("Linda", 18, 55);
        mozzarella = new Item("mozzarella", Category.DAIRY, 1);
        pasta = new Item("pasta", Category.PASTA, 2);
        toiletPaper = new Item("toiler paper", Category.HYGIENE, 3);
        Ross.addToBasket(mozzarella);
        Ross.addToBasket(pasta);
        Ross.addToBasket(toiletPaper);
    }

    @Test
    public void canCalculateTotal(){
        assertEquals(6, Jane.calculateTotal(Ross.getBasket()), 0);
    }

    @Test
    public void canCheckIfCustomerIsOver21(){
        assertEquals(false, Jane.isCustomerOver21(Linda));
        assertEquals(true, Jane.isCustomerOver21(Ross));
    }







}