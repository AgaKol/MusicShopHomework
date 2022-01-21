package shop;

import accessories.SheetMusic;
import behaviours.ISell;
import instruments.Drums;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell item1;
    ISell item2;
    ISell item3;
    ArrayList<ISell> stock = new ArrayList<>();

    @Before
    public void before() {
        item1 = new Piano(1500.00, 2459.00, "GP310", InstrumentType.KEYBOARD, "black", "Casio", 88);
        item2 = new SheetMusic(5.99, 15.99, "Complete Preludes", "G.Schirmer", "Frederic Chopin");
        item3 = new Drums(300.50, 537.00, "SBP8F30", InstrumentType.PERCUSSION, "yellow", "Yamaha", 3, "birch");
        stock.add(item1);
        stock.add(item2);
        shop = new Shop(stock);
    }

    @Test
    public void canGetStock() {
        assertEquals(stock, shop.getStock());
    }

    @Test
    public void canGetStockSize() {
        assertEquals(2, shop.checkStockSize());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(item3);
        assertEquals(3, shop.checkStockSize());
    }

    @Test
    public void canRemoveFromStock() {
        shop.removeFromStock(item1);
        assertEquals(1, shop.checkStockSize());
    }
}
