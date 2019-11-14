import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please press 1 to input sides of a Triangle, or 2 to input points.");
        int number = input.nextInt();

        if (number == 1)
        {
            System.out.println("Enter sides of Triangle:");
            double sideA = input.nextDouble();
            double sideB = input.nextDouble();
            double sideC = input.nextDouble();

            Triangle tri = new Triangle(sideA, sideB, sideC);
            tri.triType(tri.getSideA(), tri.getSideB(), tri.getSideC());
            tri.getArea(tri.getSideA(), tri.getSideB(), tri.getSideC());
            System.exit(0);
        }
        else if (number == 2)
        {
            /*
             * Tried to take in normal coordinate format with random spaces,
             * but was unsuccessful in parsing string successfully.
             *
             */
            System.out.println("Please enter 1st coordinates in (x,y) form without spaces");
            String coord1 = input.next();
            String[] num = coord1.split(",");
            String x1 = num[0].trim().substring(1).trim();
            String y1 = num[1].trim().substring(0, num[1].trim().length() - 1);

            System.out.println(x1 + y1);

            System.out.println("Please enter next coordinates");
            String coord2 = input.next();
            String[] num2 = coord2.split(",");
            String x2 = num2[0].trim().substring(1).trim();
            String y2 = num2[1].trim().substring(0, num2[1].trim().length() - 1).trim();

            System.out.println("Please enter last coordinates");
            String coord3 = input.next();
            String[] num3 = coord3.split(",");
            String x3 = num3[0].trim().substring(1).trim();
            String y3 = num3[1].trim().substring(0, num3[1].trim().length() - 1).trim();

            double pt1 = Double.valueOf(x1);
            double pt2 = Double.valueOf(x2);
            double pt3 = Double.valueOf(x3);
            double pt4 = Double.valueOf(y1);
            double pt5 = Double.valueOf(y2);
            double pt6 = Double.valueOf(y3);

            Point point1 = new Point(pt1, pt4);
            Point point2 = new Point(pt2, pt5);
            Point point3 = new Point(pt3, pt6);


/*
      System.out.println("Please enter x1");
      double pt1 = input.nextDouble();
     System.out.println("Please enter y1");
      double pt2 = input.nextDouble();
      System.out.println("Please enter x2");
      double pt3 = input.nextDouble();
     System.out.println("Please enter y2");
      double pt4 = input.nextDouble();
      System.out.println("Please enter x3");
      double pt5 = input.nextDouble();
     System.out.println("Please enter y3");
      double pt6 = input.nextDouble();

*/

            Triangle tri = new Triangle(point1, point2, point3);
            tri.triType(tri.getSideA(), tri.getSideB(), tri.getSideC());
            tri.getArea(tri.getSideA(), tri.getSideB(), tri.getSideC());
            System.exit(0);

        }
        else
            System.out.println("Please enter a valid option next time.");
        System.exit(0);
    }

}