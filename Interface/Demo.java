import java.util.*;

interface shape {
    abstract public void meth1();
    abstract public void meth2();
}

//NOTE: Interface ek Abstract method hi hai isme sare methods abstract hote hai

class cirle implements shape {
    @Override
    public void meth1(){
        System.out.println("child class meth1");
    }
    @Override
    public void meth2() {
        System.out.println("child class meth2");
    }
    public void meth3() {
        System.out.println("child class meth3");
    }
}

public class Demo {

    public static void main(String args[]) {
        // parent - parent
        // shape s = new shape();
        // Nahi ban skta aap abstract class ka reference bana skte hai
        // Object nhi bana skte

        // Dynamic method dispatch
        shape s = new cirle();
        // Isme hm kaibal parent class kai sare method call kr skte
        s.meth1(); //override child class
        s.meth2(); //override child class 

        //child - child
        cirle c = new cirle();
        //Isme hm child + parent kai methods call kr skte hai
        c.meth1(); //override child
        c.meth2(); //override child
        c.meth3(); //child
                 
    }

}

