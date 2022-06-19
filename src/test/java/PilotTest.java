import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot(CrewType.CAPTAIN,"Rocket", "P170T");
    }



    @Test
    public void pilotHasPilotsNumber(){
        assertEquals("P170T", pilot.getPilotLicence());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("I believe I can fly!",pilot.flyPlane());
    }
}
