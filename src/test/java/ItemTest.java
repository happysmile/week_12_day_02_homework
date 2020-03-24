import Products.Category;
import Products.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ItemTest {

    Item pasta;

    @Before
    public void before(){
        pasta = new Item("pasta", Category.PASTA, 2);
    }

    @Test
    public void hasPrice(){
        assertEquals(2, pasta.getPrice(), 0);
        System.out.println(pasta.getPrice());
    }
}