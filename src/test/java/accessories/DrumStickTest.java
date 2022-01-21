package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick(0.99, 2.99, "WHD Drum Sticks", "WHD", "5A", "hickory");
    }

    @Test
    public void canGetSize() {
        assertEquals("5A", drumStick.getSize());
    }

    @Test
    public void canSetSize() {
        drumStick.setSize("6A");
        assertEquals("6A", drumStick.getSize());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("hickory", drumStick.getMaterial());
    }

    @Test
    public void canSetMaterial() {
        drumStick.setMaterial("maple");
        assertEquals("maple", drumStick.getMaterial());
    }
}
