import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BedroomTest {
    Bedroom bedroom;


    @Before
    public void before(){
        bedroom = new Bedroom(17, "Suite", 4, 155.50);
    }

    @Test
    public void hasNumber(){
        assertEquals(17, bedroom.getNumber());
    }

    @Test
    public void hasType(){
        assertEquals("Suite", bedroom.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(155.50, bedroom.getNightlyRate(), 0.01);
    }

}
