package tutorial3;

import java.util.Scanner;

public class activity4{
    private double x1;
    private double y1;
    //constructor
    public activity4(double a, double b ){
        this.x1=a;
        this.y1=b;
    }
    public double distance(double x2, double y2){
        double m =x2 -this.x1;
        double n =y2-this.y1;
        return Math.sqrt((m*m+n*n));
    }
    public double distance(activity4 p2){
        return this.distance(p2.getX(), p2.getY());
    }
    public double getX(){
        return x1;
    }
    public double getY(){
        return y1;
    }
    // toString
    @Override
    public String toString() {
        return "Point2D [x = " + x1 + ", y = " + y1 + "]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        activity4 p1 = new activity4(x1, y1);
        activity4 p2 = new activity4(x2, y2);

         // output
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
        System.out.println("The distance between p1 and p2 is " + p1.distance(p2));

        sc.close();
    }

}