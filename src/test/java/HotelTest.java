import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Booking booking;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(17, "Suite", 4, 155.50);
        bedroom2 = new Bedroom(21, "single", 3, 1.00);
        guest1 = new Guest("Rick", 500);
        guest2 = new Guest("Kirsty", 1000.01);
        guest3 = new Guest("John", 0);
        conferenceRoom = new ConferenceRoom(100, "Alex's Auditorium");
        diningRoom = new DiningRoom(2, "Sian's Secret SnackBar");


        hotel.addBedRoom(bedroom1);
        hotel.addBedRoom(bedroom2);

        hotel.addDiningRoom(diningRoom);
        hotel.addConferenceRoom(conferenceRoom);


    }
//
//    @Test
//    public void bedRoomStartsEmpty(){
//        assertEquals(0, hotel.bedRoomCount());
//    }
//
//    @Test
//    public void confernenceRoomStartsEmpty(){
//        assertEquals(0, hotel.conferenceRoomCount());
//    }

//    @Test
//    public void diningRoomStartsEmpty(){
//        assertEquals(0, hotel.diningRoomCount());
//    }

    @Test
    public void canAddBedRoomToHotel(){
        hotel.addBedRoom(bedroom2);
        assertEquals(3, hotel.bedRoomCount());
    }

    @Test
    public void canAddDiningRoomToHotel(){
        assertEquals(1, hotel.diningRoomCount());
    }

    @Test
    public void canAddConferenceRoomToHotel(){
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInGuestToBedRoom(){
        hotel.checkIn(guest2, bedroom2);
        assertEquals(1, bedroom2.guestCount());
    }

    @Test
    public void canCheckOutGuestFromBedRoom(){
        hotel.checkIn(guest2, bedroom2);
        hotel.checkIn(guest1, bedroom2);
        hotel.checkOut(guest2, bedroom2);
        assertEquals(1, bedroom2.guestCount());
    }

    @Test
    public void checkNumberOfBookings(){
        assertEquals(0, hotel.bookingsCount());
    }

    @Test
    public void canMakeBooking(){
        hotel.bookRoom(1, bedroom2, guest1);
        assertEquals(1, hotel.bookingsCount());
    }

    @Test
    public void returnTotalBill(){
        hotel.bookRoom(2, bedroom1, guest1);
    }



}
