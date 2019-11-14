import java.math.*;

public class Triangle extends Point{
    private double sideA;
    private double sideB;
    private double sideC;
    private Point pt1;
    private Point pt2;
    private Point pt3;

    public Triangle() {}

    public Triangle(double sideA, double sideB, double sideC)
    {
        if (valid(sideA, sideB, sideC))
        {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
        else
            System.exit(0);
    }

    public Triangle(Point pt1, Point pt2, Point pt3)
    {
        this.sideA = getDist(pt1, pt2);
        this.sideB = getDist(pt2, pt3);
        this.sideC = getDist(pt3, pt2);

        if(!valid(sideA, sideB, sideC))
        {
            System.exit(0);
        }
    }
/*  public double calcPtSide(Point pt1, Point pt2)
    {
        return getDist(pt1, pt2);
    }
*/
    public double getDist(Point pt1, Point pt2)
    {

        double yVal = Math.pow(pt2.getYpt() - pt1.getYpt(), 2);
        double xVal = Math.pow(pt2.getXpt() - pt1.getXpt(), 2);
        return Math.abs(Math.sqrt(xVal + yVal));
    }

    ///Check validity of sides, create triangle if valid, create function to determine triangle type

    public boolean valid(double sideA, double sideB, double sideC)
    {
        double sum1 = sideA + sideB;
        double sum2 = sideA + sideC;
        double sum3 = sideB + sideC;
        if (sideA <= 0 || sideB <= 0 || sideC <= 0)
        {
            System.out.println("Sides cannot be 0 or negative, please use valid numbers");
            return false;
        }
        else if ((sum1 > sideC) && (sum2 > sideB) && (sum3 > sideA))
        {
            return true;
        }
        else
            System.out.println("Please enter valid numbers for sides");
        return false;
    }

    public void setSideA(double sideA)
    {
        this.sideA = sideA;
    }

    public void setSideB(double sideB)
    {
        this.sideB = sideB;
    }

    public void setSideC(double sideC)
    {
        this.sideC = sideC;
    }

    public double getSideA(){
        return this.sideA;
    }
    public double getSideB(){
        return this.sideB;
    }
    public double getSideC(){
        return this.sideC;
    }

    public void getArea(double sideA, double sideB, double sideC)
    {
        double s;
        double A;
        s = ((sideA + sideB + sideC)/2);
        A = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        BigDecimal Area = BigDecimal.valueOf(A).setScale(2,RoundingMode.HALF_UP);
        System.out.println("\nArea of triangle using semi-permiter: " + Area);

    }

    public void triType(double sideA, double sideB, double sideC)
    {
        if (sideA == sideB && sideB == sideC)
            System.out.print("Triangle is equilateral");
        else if (sideA == sideB || sideB == sideC || sideC == sideA)
            System.out.print("Triangle is isosceles");
        else
            System.out.print("Triangle is scalene");

        if (isRight(sideA, sideB, sideC) == true)
            System.out.print(" and also right");

    }

    public boolean isRight(double sideA, double sideB, double sideC)
    {
        if (sideC == Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB, 2)))
            return true;
        else if (sideB == Math.sqrt(Math.pow(sideA,2) + Math.pow(sideC, 2)))
            return true;
        else if (sideA == Math.sqrt(Math.pow(sideC,2) + Math.pow(sideB, 2)))
            return true;
        else
            return false;
    }
}