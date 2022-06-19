import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    CabinCrewMember cabinCrewMember4;
    CabinCrewMember cabinCrewMember5;

    @Before
    public void before() {
        cabinCrewMember1 = new CabinCrewMember(CrewType.CAPTAIN,"Quill" );
        cabinCrewMember2 = new CabinCrewMember(CrewType.PILOT,"Rocket" );
        cabinCrewMember3 = new CabinCrewMember(CrewType.FLIGHT_ATTENDANT,"Groot" );
        cabinCrewMember4 = new CabinCrewMember(CrewType.PURSER,"Drax" );
        cabinCrewMember5 = new CabinCrewMember(CrewType.FIRST_OFFICER,"Gamora" );
    }

    @Test
    public void cabinCrewMemberHasName() {
        assertEquals("Quill", cabinCrewMember1.getName());
    }

    @Test
    public void cabinCrewHasRank(){
        assertEquals(CrewType.CAPTAIN, cabinCrewMember1.getCrewType());
    }

    @Test
    public void canGetMessageToPassengers(){
        assertEquals("Is there a Doctor on board?", cabinCrewMember1.getMessageToPassenger());
    }
}
