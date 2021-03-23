import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {

    PetRock rocky = new PetRock("Rocky");

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
}