package accessories;

import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings strings;

    @Before
    public void before() {
        strings = new GuitarStrings(2, 4, "80/20 Bronze Acoustic", "Martin&Co", ".022w");
    }

    @Test
    public void canGetName() {
        assertEquals("80/20 Bronze Acoustic", strings.getName());
    }

    @Test
    public void canSetName() {
        strings.setName("80/15 Bronze");
        assertEquals("80/15 Bronze", strings.getName());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Martin&Co", strings.getBrand());
    }

    @Test
    public void canSetBrand() {
        strings.setBrand("Fender");
        assertEquals("Fender", strings.getBrand());
    }

    @Test
    public void canGetGauge() {
        assertEquals(".022w", strings.getGauge());
    }

    @Test
    public void canSetGauge() {
        strings.setGauge("0.20");
        assertEquals("0.20", strings.getGauge());
    }

    @Test
    public void canGetInstrument() {
        assertEquals(InstrumentType.STRINGS, strings.getForInstrument());
    }
}
