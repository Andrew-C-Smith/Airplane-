import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;
    Plane plane;
    Plane plane2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    CabinCrewMember cabinCrewMember4;


    @Before
    public void before(){
        plane = new Plane(PlaneType.THE_MILANO);
        plane2 = new Plane(PlaneType.BIPLANE);
        flight = new Flight(plane, "1", "Nowhere", "Nova",
                "now");
        flight2 = new Flight(plane2, "2", "Hopefully Somewhere", "The Beach",
                "Whenever you're Ready");

        passenger1 = new Passenger("Thor", 0);
        passenger2 = new Passenger("IronMan", 2);
        passenger3 = new Passenger("Hawkeye",2);
    }

    @Test
    public void flightHasPilot(){
        pilot = new Pilot(CrewType.CAPTAIN,"Rocket", "P170T");
        flight.registerPilot(pilot);
        assertEquals(1, flight.getPilots());
    }


    @Test
    public void flightHasListofCabinCrew(){
        cabinCrewMember1 = new CabinCrewMember(CrewType.CAPTAIN,"Quill" );
        cabinCrewMember2 = new CabinCrewMember(CrewType.PILOT,"Rocket" );
        cabinCrewMember3 = new CabinCrewMember(CrewType.FLIGHT_ATTENDANT,"Groot" );
        cabinCrewMember4 = new CabinCrewMember(CrewType.PURSER,"Drax" );
        flight.registerCabinCrew(cabinCrewMember1);
        flight.registerCabinCrew(cabinCrewMember2);
        flight.registerCabinCrew(cabinCrewMember3);
        flight.registerCabinCrew(cabinCrewMember4);
        assertEquals(4, flight.getCabinCrew());
    }


    @Test
    public void flightHasEmptyListOfGuestBookings(){
        assertEquals(0, flight.getPassengers());
    }


    @Test
    public void flightHasFlightNumber(){
        assertEquals("1", flight.getFlightNumber());

    }

    @Test
    public void flightHasDestination(){
        assertEquals("Nowhere", flight.getFlightDestination());

    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("Nova", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("now", flight.getDepartureTime());

    }

    @Test
    public void flightCanReturnNumberOfAvailableSeats(){
        flight.registerPassenger(passenger1);
        flight.registerPassenger(passenger2);
        flight.registerPassenger(passenger3);

        assertEquals(9, flight.getEmptySeats());

    }

    @Test
    public void flightCanMakeABooking(){
        flight.registerPassenger(passenger1);
        assertEquals(1, flight.getPassengers());

    }

    @Test
    public void flightCantMakeBookingIfFlightFull(){
        flight2.registerPassenger(passenger1);
        flight2.registerPassenger(passenger2);
        flight2.registerPassenger(passenger3);
        assertEquals(2, flight2.getPassengers());

    }
}
