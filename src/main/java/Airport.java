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
}
