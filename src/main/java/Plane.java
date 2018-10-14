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

    public int hasNoPassengers() {
        return passengers.size();
    }

    public int passengerCount(Passenger passenger) {
        this.passengers.add(passenger);
        return passengers.size();
    }

    public int removePassengers(Passenger passenger) {
        this.passengers.remove(passenger);
        return  passengers.size();

    }


    public int getCapacity() {
        return this.planeType.getCapacity();
    }

    public String capacityFull() {
        if(int passeneger<  planeType.getCapacity());
    }
}
