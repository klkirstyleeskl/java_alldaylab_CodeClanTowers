import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;


    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public int bedRoomCount(){
        return this.bedrooms.size();
    }
    public int conferenceRoomCount(){
        return this.conferenceRooms.size();
    }
    public int diningRoomCount() {
        return this.diningRooms.size();
    }
    public int bookingsCount(){
        return this.bookings.size();
    }

    public void addBedRoom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addDiningRoom(DiningRoom diningRoom){
        this.diningRooms.add(diningRoom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkIn(Guest guest, Bedroom bedroom){
        bedroom.addGuest(guest);
    }

    public void checkOut(Guest guest, Bedroom bedroom){
        bedroom.removeGuest(guest);
    }

    public void bookRoom(int numberOfNights, Bedroom bedroom, Guest guest){


        Booking newBooking = new Booking(numberOfNights, bedroom, guest);
        this.bookings.add(newBooking);
    }

    // public double getFare(int numberOfNights, Bedroom bedroom){
    //      get fare from bedroom

    //      calculate fare * no of nights
    //      return the fare
    // }



}
