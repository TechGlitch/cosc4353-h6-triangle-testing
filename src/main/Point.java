import java.math.*;

public class Point {
    private double xpt;
    private double ypt;

    Point(){
        this.xpt = 0;
        this.ypt = 0;
    }

    Point(double x, double y)
    {
        this.xpt = x;
        this.ypt = y;
    }

    public void setXpt(double xpt) {
        this.xpt = xpt;
    }

    public void setYpt(double ypt) {
        this.ypt = ypt;
    }

    public double getXpt() {
        return xpt;
    }

    public double getYpt() {
        return ypt;
    }

    /*
    private double sideA;
    private double sideB;
    private double sideC;
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Point() {}

    public Point(double x1, double x2, double x3, double y1, double y2, double y3)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        setSideA(x1, x2, y1, y2);
        setSideB(x2, x3, y2, y3);
        setSideC(x3, x1, y3, y1);
    }


    public void setSideA(double x1, double x2, double y1, double y2)
    {
        this.sideA = getDist(x1,x2,y1,y2);
    }

    public void setSideB(double x2, double x3, double y2, double y3)
    {
        this.sideB = getDist(x2,x3,y2,y3);
    }

    public void setSideC(double x3, double x1, double y3, double y1)
    {
        this.sideC = getDist(x3,x1,y3,y1);
    }

    public double getDist(double x1, double x2, double y1, double y2)
    {
        double yVal = Math.pow(y2 - y1, 2);
        double xVal = Math.pow(x2 - x1, 2);
        return Math.abs(Math.sqrt(xVal + yVal));
    }

    public double getSideA()
    {
        return sideA;
    }

    public double getSideB()
    {
        return sideB;
    }

    public double getSideC()
    {
        return sideC;
    }
     */
}
