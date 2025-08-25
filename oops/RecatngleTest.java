import java.util.*;

class rectangle{
    public double b;
    public double l;

    public double area(){
        return l*b;
    }

    public double perimeter(){
        return 2*(l+b);
    }
};

public class RecatngleTest {
    public static void main(String args[]){
        rectangle r = new rectangle();
        r.b = 12.3;
        r.l = 11.4;

        System.out.println("are of rectangle is "+r.area());
        System.out.println("Perimeter of a rectangle is "+r.perimeter());
    }    
}
