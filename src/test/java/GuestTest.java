import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Kirsty", 1000.01);
    }

    @Test
    public void hasName(){
        assertEquals("Kirsty", guest.getName());
    }

    @Test
    public void hasMoneyInWallet(){
        assertEquals(1000.01, guest.getWallet(), 0.01);
    }
}
