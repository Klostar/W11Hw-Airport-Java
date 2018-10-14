import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;


    @Before
    public void before(){
       plane = new Plane("Ryan Air", PlaneType.BOEING787);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING787, plane.hasPlaneType());
    }

    @Test
    public void hasAirline(){
        assertEquals("Ryan Air", plane.hasAirline());
    }
    @Test
    public void hasNoPassengers(){
        assertEquals(0, plane.hasNoPassengers());
    }
}
