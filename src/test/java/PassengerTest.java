import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("John", 1);
    }

    @Test
    public void passengerHasName(){
        assertEquals("John", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }


}
