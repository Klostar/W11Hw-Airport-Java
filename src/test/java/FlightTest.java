import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void before(){
        flight = new Flight("FR589",PlaneType.BOEING767,"Pisa");
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("FR589", flight.hasFlightNumber());
    }

    @Test
    public void flightHasPlaneType(){
        assertEquals(PlaneType.BOEING767, flight.hasPlane());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("Pisa", flight.hasDestination());
    }
}
