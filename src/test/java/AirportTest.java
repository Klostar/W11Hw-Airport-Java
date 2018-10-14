import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AirportTest {
    Airport airport;
    Plane plane;
    Flight flight;


    @Before
    public void before(){
        airport = new Airport("GLA");
        plane = new Plane("Ryan Air", PlaneType.BOEING787);
        flight = new Flight("FR543", PlaneType.BOEING767,"Rome");
    }

    @Test
    public void hasAirportCode(){
        assertEquals("GLA", airport.hasAirportCode());
    }



}
