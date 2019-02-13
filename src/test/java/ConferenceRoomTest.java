import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;


    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(100, "The Dell Room");
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("The Dell Room", conferenceRoom.getName());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom.guestCount());
    }




}
