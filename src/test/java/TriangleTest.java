import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TriangleTest {

    @org.junit.Test
    public void getDist() {
        Triangle test = new Triangle();
        Point p1 = new Point();
        Point p2 = new Point(2,2);
        double value = test.getDist(p1, p2);

        double expected = 2.828;

        assertEquals("Testing Basic Dist func at .01 level", expected, value, .01);
    }

    @org.junit.Test
    public void valid() { ;
        Triangle tri = new Triangle();
        boolean test = tri.valid(3, 4, 5);
        assertTrue("Testing for Valid Triangle",test);
    }

    @Test
    public void valid2() {
        Triangle tri = new Triangle();
        assertFalse("Testing a non-valid Triangle", tri.valid(-1,2,4));
    }

    @org.junit.Test
    public void setSideA() {
        Triangle tri = new Triangle();
        tri.setSideA(3.2);
        double expected = 3.2;
        assertEquals("Testing if setter works", expected, tri.getSideA(), 0);
    }

    @org.junit.Test
    public void getSideA() {
        Triangle tri = new Triangle(3,4,5);
        double expected = 3;
        assertEquals(expected, tri.getSideA(), 0);

    }

    @org.junit.Test
    public void getAreaInt() {
        Triangle tri = new Triangle();
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tri.getArea(3,4,5);
        assertEquals("Basic int Area test", "\nArea of triangle using semi-permiter: 6.00\n", os.toString());
    }

    @Test
    public void getAreaDouble() {
        Triangle tri = new Triangle();
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tri.getArea(12.5,8.11,5.5);
        assertEquals("Basic int Area test", "\nArea of triangle using semi-permiter: 16.45\n", os.toString());
    }

    @org.junit.Test
    public void triType() {
        Triangle tri = new Triangle(3,3,3);

        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        tri.triType(3,3,3);

        assertEquals("Triangle is equilateral", os.toString());
    }

    @Test
    public void triType2() {
        Triangle tri = new Triangle(3,3,5);

        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        tri.triType(3,3,5);

        assertEquals("Triangle is isosceles", os.toString());
    }

    @Test
    public void triType3() {
        Triangle tri = new Triangle(3,4,5);

        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        tri.triType(3,4,5);

        assertEquals("Triangle is scalene and also right", os.toString());
    }

    @Test
    public void triType4() {
        Triangle tri = new Triangle(4,5,6);

        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        tri.triType(4,5,6);
        assertEquals("Triangle is scalene", os.toString());
    }

    @org.junit.Test
    public void isRight() {
        Triangle tri = new Triangle(7,24,25);
        assertTrue(tri.isRight(7,24,25));
    }
}