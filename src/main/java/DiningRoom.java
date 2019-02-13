
import java.util.ArrayList;

public class DiningRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> diningRoomGuests;


    public DiningRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.diningRoomGuests = new ArrayList<>();
    }

    public int getCapacity(){
        return capacity;
    }

    public String getName(){
        return name;
    }

    public int guestCount(){
        return  diningRoomGuests.size();
    }

}



