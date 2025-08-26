import java.util.*;

class circle{
    private int radius;

    // public circle() {
    //     this.radius = 0;
    // }

    public circle(int r){
        this.radius = r;
    }

    public int perimeter(){
        return 2*radius;
    }

    public int area(){
        return radius*radius;
    }
}

class cylinder extends circle{
    public int height;

    public cylinder(int r,int h){
        super(r);  //yeh circle ka parameter constructor call krega
        this.height = h;
    }

    public double volume(){
        return area()*height;
    }
}

// NOTE: Tumhari current code me error isliye aaya kyunki cylinder ka constructor likhne par Java automatically circle(parent) ka default constructor call karna chah raha tha, par wo exist hi nahi karta.
// --> 1st tareeka: To jab cylinder ka constructor call hota hai, wo circle() (default wala) dhundhta hai, par wo hai hi nahi → isliye add default constructor.
// --> 2nd tareeka: super ek keyword hai Java me, jo child class se parent class (superclass) ke members ko refer karne ke kaam aata hai
// --> add public cylinder(int r, int h) {
//        super(r);       // parent class ka constructor call
//        this.height = h;
//    }  
// --> Tumhare case me super(r) isliye use hua tha kyunki Circle ka constructor parameter lega (radius set karne ke liye), aur jab Cylinder ka object banega to woh pehle parent constructor call karega, phir apna.
public class CylinderTest {
    
    public static void main(String args[]){
        cylinder c = new cylinder(4, 05);

        System.out.println("area "+c.area());
        System.out.println("volume "+c.volume());

        // circle c2 = new cylinder(5, 10);

        // System.out.println("area "+c2.area());
        // System.out.println("volume "+c2.volume());
        // Mai volume access nhi paa rha hu kyuki cicle class interface nhi hai 
    
        
    }
}
