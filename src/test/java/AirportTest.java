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

    @Test
    public void testEmptyHanger(){
        assertEquals(0, airport.hangerCount());
    }

    @Test
    public void canAddPlaneToHanger(){
        airport.addPlane(plane);
        assertEquals(1, airport.hangerCount());
    }

    @Test
    public void canRemovePlaneFromHanger(){
        airport.addPlane(plane);
        assertEquals(1, airport.hangerCount());
        airport.removePlaneFromHanger(plane);
        assertEquals(0, airport.hangerCount());
    }

}
