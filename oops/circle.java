import java.util.*;

class area{
    public double area;
    public double radius;

    public area(double radius){     //This is a constructor not a method
        this.radius = radius;
        this.area = Math.PI*(radius*radius);
    }
};

public class circle {
    public static void main(String args[]){
        double radius;
        Scanner s = new Scanner(System.in);
        radius = s.nextDouble();
        area a = new area(radius);
        System.out.println("Area of the circle is "+a.area);
    }
}
