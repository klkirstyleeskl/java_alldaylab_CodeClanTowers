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
        return this.number;
    }


    public String getType(){
        return this.type;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getNightlyRate(){
        return this.nightlyRate;
    }

}
