import java.util.ArrayList;

public class Airport {
    private String airportCode;
    private ArrayList<Plane>hanger;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.hanger = new ArrayList<>();

    }

    public String hasAirportCode() {
       return this.airportCode;

    }

    public int hangerCount() {
        return this.hanger.size();
    }

    public void addPlane(Plane plane) {
        hanger.add(plane);
    }

    public void removePlaneFromHanger(Plane plane) {
        hanger.remove(plane);
    }

    public Flight createFlight(Plane plane, String flightNumber, String destination) {
        removePlaneFromHanger(plane);
        Flight newFlight = new Flight("FR456", PlaneType.BOEING747, "Milan");
        return newFlight;
    }
}
