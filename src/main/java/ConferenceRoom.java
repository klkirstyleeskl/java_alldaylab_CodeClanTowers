import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> conferenceRoomGuests;


    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.conferenceRoomGuests = new ArrayList<>();
    }

    public int getCapacity(){
        return capacity;
    }

    public String getName(){
        return name;
    }

    public int guestCount(){
        return  conferenceRoomGuests.size();
    }

}
