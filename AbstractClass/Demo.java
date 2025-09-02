import java.util.*;

abstract class shape {
    public void meth1() {
        System.out.println("parent class meth1");
    }

    public void meth2() {
        System.out.println("parent class meth2");
    }
}

class cirle extends shape {
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
        s.meth1(); //parent class
        s.meth2(); //override child class 

        //child - child
        cirle c = new cirle();
        //Isme hm child + parent kai methods call kr skte hai
        c.meth1(); //parent 
        c.meth2(); //override child
        c.meth3(); //child

        //NOTE: Inheritance mai do cheez hoti hai properties & behaviour
        // Properties: variable, methods jo parent class mai declare kiye hai
        // Behaviour: methods ko define krna hi behaviour hota hai
        
          
    }

}

// //NOTE: Difference between abstract class and parent class
// //Parent class:

// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     // khud ka eat() override kar bhi sakti hai, nahi bhi
// }

// //Abstract Class

// abstract class Animal {
//     abstract void sound(); // must override in child
//     void eat() {
//         System.out.println("Animal eats food");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Bark");
//     }
// }

// Simple rule:

// Agar tumhe compulsory karna ho ki har child class ek specific behavior define kare → abstract class use karo.

// Agar tumhe bas ek common base behavior dena ho jo child optionally override kare → normal parent class use karo.