import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BedroomTest {
    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){
        bedroom = new Bedroom(17, "Suite", 4, 155.50);
        guest1 = new Guest("Rick", 500);
        guest2 = new Guest("Kirsty", 1000.01);
        guest3 = new Guest("John", 0);
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

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void checkInGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void checkOutGuest(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.removeGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }



}
