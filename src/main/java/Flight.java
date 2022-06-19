import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot>pilots;
    private ArrayList<CabinCrewMember>cabinCrew;
    private ArrayList<Passenger>passengers;
    private Plane plane;
    String flightNumber;
    String destination;
    String departureAirport;
    String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.pilots = pilots;
        this.cabinCrew = cabinCrew;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getPilots() {
        return this.pilots.size();
    }

    public int getCabinCrew() {
        return this.cabinCrew.size();
    }

    public void registerPassenger(Passenger passenger) {
        if(passengers.size() < plane.getPlaneType().getCapacity()) {
            this.passengers.add(passenger);
        }
    }

    public int getPassengers() {
        return this.passengers.size();
    }


    public void registerPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public void registerCabinCrew(CabinCrewMember crew) {
        this.cabinCrew.add(crew); }

    public String getFlightNumber() {
        String flightNumber = this.flightNumber;
        return flightNumber;
    }

    public String getFlightDestination() {
        String destination = this.destination;
        return destination;
    }

    public String getDepartureAirport() {
        String departureAirport = this.departureAirport;
        return departureAirport;
    }

    public String getDepartureTime() {
        String departureTime = this.departureTime;
        return departureTime;
    }

    public int getEmptySeats() {
        int emptySeats = this.plane.getPlaneType().getCapacity() - getPassengers();
        return emptySeats;
    }
}


