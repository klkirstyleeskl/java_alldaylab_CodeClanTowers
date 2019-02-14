public class Booking{
    private int numberOfNights;
    private Bedroom bedroom;
    private Guest guest;


    public Booking(int numberOfNights, Bedroom bedroom, Guest guest){
        this.numberOfNights = numberOfNights;
        this.bedroom = bedroom;
        this.guest = guest;
    }
}
