package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before() {
        drums = new Drums(300.50, 537.00, "SBP8F30", InstrumentType.PERCUSSION, "yellow", "Yamaha", 3, "birch");
    }

    @Test
    public void canGetDrumsNumber() {
        assertEquals(3, drums.getDrumsNumber());
    }

    @Test
    public void canSetDrumsNumber() {
        drums.setDrumsNumber(5);
        assertEquals(5, drums.getDrumsNumber());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("birch", drums.getMaterial());
    }

    @Test
    public void canSetMaterial() {
        drums.setMaterial("maple");
        assertEquals("maple", drums.getMaterial());
    }

    @Test
    public void canPlay() {
        assertEquals("Boom, boom, boom!", drums.play());
    }
}
