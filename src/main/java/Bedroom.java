import java.util.ArrayList;

public class Bedroom {

    private int number;
    private String type;
    private int capacity;
    private ArrayList<Guest> guests;
    private double nightlyRate;

    public Bedroom(int number, String type, int capacity, double nightlyRate){
        this.number = number;
        this.type = type;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.nightlyRate = nightlyRate;

    }


    public int getNumber(){
        return number;
    }


    public String getType(){
        return type;
    }

    public int getCapacity(){
        return capacity;
    }

    public double getNightlyRate(){
        return nightlyRate;
    }

    public int guestCount(){
        return guests.size();
    }

    public Guest addGuest(Guest guest){
        if (this.guestCount() < this.capacity){
            this.guests.add(guest);
        }
        return guest;
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }


}
