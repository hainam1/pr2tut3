package tutorial3;
public class activity1{
    private double radius = 1.0;
    private String color = "red";

public double getRadius(){
    return radius;
}
public String getColor(){
    return color;
}
public double getArea(){
    return Math.PI * radius * radius;
}

public activity1(){
    radius=1.0;
    color="red";
}
public activity1(double r){
    radius=r;
    color ="red";
}
public activity1(double r, String c){
    radius=r;
    color =c;
}

void display(){
    System.out.println(getRadius());
    System.out.println(getColor());
    System.out.println(getArea());
}
public static void main (String[]args){
    activity1 c1=new activity1();
    activity1 c2=new activity1(2.0);
    activity1 c3=new activity1(3.0, "yellow");

    c1.display();
    c2.display();
    c3.display();
    
}
}