import Products.Category;
import Products.DiscountedItem;
import Products.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountedItemTest {
    Item pasta;
    DiscountedItem pastaD;

    @Before
    public void before(){
        pasta = new Item("pasta", Category.PASTA, 2);
        pastaD = new DiscountedItem("pasta", Category.PASTA, 2, 10);
    }

    @Test
    public void hasDiscountedPrice(){
        assertEquals(2, pasta.getPrice(), 0);
        assertEquals(1.8, pastaD.getPrice(), 0);
        System.out.println(pastaD.getPrice());
    }
}