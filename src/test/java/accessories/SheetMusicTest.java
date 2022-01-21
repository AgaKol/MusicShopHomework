package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(5.99, 15.99, "Complete Preludes", "G.Schirmer", "Frederic Chopin");
    }

    @Test
    public void canGetComposer() {
        assertEquals("Frederic Chopin", sheetMusic.getComposer());
    }

    @Test
    public void canSetComposer() {
        sheetMusic.setComposer("Chopin");
        assertEquals("Chopin", sheetMusic.getComposer());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10.00, sheetMusic.calculateMarkup(), 0.0);
    }
}
