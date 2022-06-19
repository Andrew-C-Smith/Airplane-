public class CabinCrewMember {

    private String name;
    private CrewType crewType;

    public CabinCrewMember(CrewType crewType, String name) {
        this.crewType = crewType;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public CrewType getCrewType() {
        return this.crewType;
    }

    public String getMessageToPassenger() {
        return "Is there a Doctor on board?";
    }
}
