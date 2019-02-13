import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

   DiningRoom diningRoom;


    @Before
    public void before(){
        diningRoom = new DiningRoom(20, "Riddell's Ramen");
    }

    @Test
    public void hasCapacity(){
        assertEquals(20, diningRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Riddell's Ramen", diningRoom.getName());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, diningRoom.guestCount());
    }




}
