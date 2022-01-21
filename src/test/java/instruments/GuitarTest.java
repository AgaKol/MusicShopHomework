package instruments;

import accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    GuitarStrings strings;
    GuitarStrings strings2;

    @Before
    public void before() {
        strings = new GuitarStrings(2, 4, "80/20 Bronze Acoustic", "Martin&Co", ".022w");
        strings2 = new GuitarStrings(2, 5, "80/20 Bronze Acoustic", "Martin&Co", ".022w");
        guitar = new Guitar(110, 160.99, "CC-60S Acoustic", InstrumentType.STRINGS,"natural", "Fender", "right handed", strings, 6);
    }

    @Test
    public void canGetPriceBought() {
        assertEquals(110, guitar.getPriceBought(), 0.0);
    }

    @Test
    public void canSetPriceBought() {
        guitar.setPriceBought(100);
        assertEquals(100, guitar.getPriceBought(), 0.0);
    }

    @Test
    public void canGetPriceSold() {
        assertEquals(160.99, guitar.getPriceSold(), 0.0);
    }

    @Test
    public void canSetPriceSold() {
        guitar.setPriceSold(170.00);
        assertEquals(170.00, guitar.getPriceSold(), 0.0);
    }

    @Test
    public void canGetName() {
        assertEquals("CC-60S Acoustic", guitar.getName());
    }

    @Test
    public void canSetName() {
        guitar.setName("CC-70S Concert");
        assertEquals("CC-70S Concert", guitar.getName());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }

    @Test
    public void canSetType() {
        guitar.setType(InstrumentType.BRASS);
        assertEquals(InstrumentType.BRASS, guitar.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("natural", guitar.getColour());
    }

    @Test
    public void canSetColour() {
        guitar.setColour("black");
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void canSetBrand() {
        guitar.setBrand("Ortega");
        assertEquals("Ortega", guitar.getBrand());
    }

    @Test
    public void canGetDexterity() {
        assertEquals("right handed", guitar.getDexterity());
    }

    @Test
    public void canSetDexterity() {
        guitar.setDexterity("left handed");
        assertEquals("left handed", guitar.getDexterity());
    }

    @Test
    public void canGetStrings() {
        assertEquals(strings, guitar.getStrings());
    }

    @Test
    public void canSetStrings() {
        guitar.setStrings(strings2);
        assertEquals(strings2, guitar.getStrings());
    }

    @Test
    public void canGetStringsNumber() {
        assertEquals(6, guitar.getStringNumber());
    }

    @Test
    public void canSetStringsNumber() {
        guitar.setStringNumber(5);
        assertEquals(5, guitar.getStringNumber());
    }
}
