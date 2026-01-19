package tutorial3;

public class activit2 {
    //private variable instant
    private float length = 1.0f;
    private float width = 1.0f;

    //constructor
    public activit2(){
    }
    public activit2(float l, float w){
        this.length=l;
        this.width=w;
    }

    //method
    public float getLength(){
        return length;
    }
    public void setLength(float l){
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float w){
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
    public String toString() {
        return "Rectange[length=" + length + ", width=" + width + "]";
    }

public static void main(String[] args) {
   activit2 r1 = new activit2(1.2f, 3.4f);
   System.out.println(r1); // test toString()
   activit2 r2 = new activit2(); // test default constructor
   System.out.println(r2);

   // Test setters and getters
   r1.setLength(5.6f);
   r1.setWidth(7.8f);
   System.out.println("Length is: " + r1.getLength());
   System.out.println("Width is: " + r1.getWidth());

   // Test getArea() and getPerimeter()
   System.out.printf("Area is: %.2f%n", r1.getArea());
   System.out.printf("Perimeter is: %.2f%n", r1.getPerimeter());
}

}
