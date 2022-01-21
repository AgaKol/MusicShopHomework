package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(1500.00, 2459.00, "GP310", InstrumentType.KEYBOARD, "black", "Casio", 88);
    }

    @Test
    public void canGetKeysNumber() {
        assertEquals(88, piano.getKeysNumber());
    }

    @Test
    public void canSetKeysNumber() {
        piano.setKeysNumber(100);
        assertEquals(100, piano.getKeysNumber());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink", piano.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(959.00, piano.calculateMarkup(), 0.0);
    }
}
