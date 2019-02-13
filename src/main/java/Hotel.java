import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private  ArrayList<DiningRoom> diningRooms;
    private  ArrayList<ConferenceRoom> conferenceRooms;


    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public int bedRoomCount(){
        return this.bedrooms.size();
    }
    public int conferenceRoomCount(){
        return this.conferenceRooms.size();
    }
    public int diningRoomCount(){
        return this.diningRooms.size();
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



}
