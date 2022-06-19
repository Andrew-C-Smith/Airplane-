import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.THE_MILANO);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.THE_MILANO, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(12, PlaneType.THE_MILANO.getCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(600, PlaneType.THE_MILANO.getTotalWeight());
    }

}
