

public class Guest {
    private String guestName;
    private double guestWallet;



    public Guest(String guestName, double guestWallet){
        this.guestName = guestName;
        this.guestWallet = guestWallet;
    }

    public String getName(){
        return guestName;
    }

    public double getWallet(){
        return guestWallet;
    }
}
