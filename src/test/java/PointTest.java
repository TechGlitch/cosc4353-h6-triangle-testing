import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void setXpt() {
        Point pt1 = new Point(0,0);
        pt1.setXpt(4);
        boolean equal;
        Point expected = new Point(4,0);
        if (pt1.getXpt() == expected.getXpt()){
            equal = true;
        }
        else
            {equal = false;}

        assertTrue("Setting X to 4", equal);
    }

    @Test
    public void setYpt() {
        Point pt = new Point();
        pt.setYpt(4.4);
        boolean equal;
        Point expected = new Point(0,4.4);
        if (pt.getXpt() == expected.getXpt()){
            equal = true;
        }
        else
        {equal = false;}

        assertTrue("Setting X to 4", equal);
    }

    @Test
    public void getXpt() {
        Point p2 = new Point(2,1);
        double expectedXpt = 2;
        assertEquals("Get Xpt", expectedXpt, p2.getXpt(), 0.0);
    }

    @Test
    public void getYpt() {
        Point p3 = new Point(2,1.1);
        double expectedYpt = 1.1;
        assertEquals("Get Ypt", expectedYpt, p3.getYpt(), 0.0);
    }
}