import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(17, "Suite", 4, 155.50);
        guest1 = new Guest("Rick", 500);
        guest2 = new Guest("Kirsty", 1000.01);
        guest3 = new Guest("John", 0);
        conferenceRoom = new ConferenceRoom(100, "Alex's Auditorium");
        diningRoom = new DiningRoom(2, "Sian's Secret SnackBar");


        hotel.addBedRoom(bedroom);

    }
//
//    @Test
//    public void bedRoomStartsEmpty(){
//        assertEquals(0, hotel.bedRoomCount());
//    }

    @Test
    public void confernenceRoomStartsEmpty(){
        assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test
    public void diningRoomStartsEmpty(){
        assertEquals(0, hotel.diningRoomCount());
    }

    @Test
    public void canAddBedRoomToHotel(){
        assertEquals(1, hotel.bedRoomCount());
    }

    @Test
    public void canAddDiningRoomToHotel(){
        hotel.addDiningRoom();
        assertEquals(1, hotel.diningRoomCount());
    }




}
