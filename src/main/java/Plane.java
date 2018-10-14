import java.util.ArrayList;

public class Plane {
    private PlaneType planeType;
    private String airLine;
    private ArrayList<Passenger> passengers;

    public Plane(String airLine, PlaneType planeType){
        this.airLine = airLine;
        this.planeType = planeType;
        this.passengers = new ArrayList<>();

    }


    public PlaneType hasPlaneType() {
        return planeType;
    }

    public String hasAirline() {
        return airLine;
    }
}
