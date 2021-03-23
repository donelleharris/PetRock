import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class PetRockTest {

    private PetRock rocky;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);
    @Before
    public void myTestSetup() throws Exception {
        rocky = new PetRock("Rocky");
    }
    @Test
    public void getName() {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testUnhappyToStart() throws Exception{
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Ignore("Exception throwing not yet defined")
    @Test (expected = IllegalStateException.class)
    public void nameFail() throws Exception{
        rocky.getHappyMessage();
    }

    @Test
    public void name() throws Exception{
        rocky.playWithRock();
        String msg = rocky.getHappyMessage();
        assertEquals("I'm happy!", msg);
    }

    @Test
    public void testFavNum() throws Exception {
        assertEquals(42, rocky.getFavNumber());
    }

    @Test (expected = IllegalArgumentException.class)
    public void emptyNameFail () throws Exception{
        new PetRock("");
    }

    @Test(timeout = 100) //in ms
    public void waitForHappyTimeout() throws Exception{
        rocky.waitTillHappy();
    }
}