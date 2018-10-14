public class Flight {

    private String flightNumber;
    private PlaneType planeType;
    private String destination;

    public Flight(String flightNumber, PlaneType planeType, String destination){
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.destination = destination;

    }


    public String hasFlightNumber() {
        return this.flightNumber;
    }

    public PlaneType hasPlane() {
        return this.planeType;
    }


    public String hasDestination() {
        return this.destination;
    }
}
