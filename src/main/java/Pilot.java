public class Pilot extends CabinCrewMember {

    private String pilotLicence;



    public Pilot(CrewType crewType, String name, String pilotLicence) {
        super(crewType, name);
        this.pilotLicence = pilotLicence;

    }

    public String getPilotLicence() {
        return pilotLicence;
    }

    public String flyPlane() {
        return "I believe I can fly!";
    }
}
