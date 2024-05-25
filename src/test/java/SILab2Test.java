import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class SILab2Test {

    @Test
    void EveryBranch()
    {
        Item item1= new Item("Nike" ,"0756" ,200, 4f); //payment 1000
        Item item2= new Item("Pustina" ,null ,150, 4f); //payment 100
        Item item3= new Item("" ,"0523" ,400, 6.5f); //payment 80
        Item item4= new Item("Jacket" ,"-54" ,330, 0.0f); //payment 1000
        Item item5= new Item("Nokia" ,"0256" ,200, 3f); //payment 1000



        products.add(item1);
        //1 2 4 5.1 5.2 6 7 9 10 11 12.1 13 14 16 17 22 24 27
        assertEquals(true,SILab2.checkCart(products,1000));

        products.remove(item1);



        products.add(item2);
          //1 2 4 5.1 5.2 6 7 9 21 EXIT
        RuntimeException isklucok;
        isklucok=assertThrows(RuntimeException.class, () -> SILab2.checkCart(products,100));
        assertTrue(isklucok.getMessage().contains("No barcode!"));

        products.remove(item2);

        products.add(item3);
        //1 2 4 5.1 5.2 6 7 9 10 11 12.1 13 14 16 17 22 23 24 27
        assertEquals(false,SILab2.checkCart(products,80));

        products.remove(item3);

        products.add(item4);
        //1 2 4 5.1 5.2 6 7 9 10 11 12.1 13 14 16 17 22 23 24 27
        RuntimeException isklucok1;
        isklucok1=assertThrows(RuntimeException.class, () -> SILab2.checkCart(products,1000));
        assertTrue(isklucok1.getMessage().contains("Invalid character in item barcode!"));

        products.remove(item4);



        products.add(item5);
        //1 2 4 5.1 5.2 6 7 9 10 11 12.1 13 14 16 17 22 24 25 EXIT
        assertEquals(true,SILab2.checkCart(products,1000));

        products.remove(item5);









    }

    @Test
    void MCCCondition()
    {
        Item item6= new Item("Omega" ,"0254" ,400, 2f); //payment 1000
        products.add(item6);
        assertTrue(SILab2.checkCart(products,1000));
        assertEquals(770,SILab2.zbir);
        products.remove(item6);

        Item item7= new Item("LMAO" ,"0567" ,150, 3f); //payment 800
        products.add(item7);
        assertTrue(SILab2.checkCart(products,800));
        assertEquals(450,SILab2.zbir);
        products.remove(item7);

        Item item8= new Item("" ,"0942" ,500, 0f); //payment 900
        products.add(item8);
        assertTrue(SILab2.checkCart(products,900));
        assertEquals(500,SILab2.zbir);
        products.remove(item8);


        Item item9= new Item("KOBRA" ,"876" ,600, 4f); //payment 2500
        products.add(item9);
        assertTrue(SILab2.checkCart(products,2500));
        assertEquals(2400,SILab2.zbir);
        products.remove(item9);





    }

    private List<Item> products = new ArrayList<>(1);

}
