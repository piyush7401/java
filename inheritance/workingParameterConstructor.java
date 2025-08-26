import java.util.*;

class parent{
    public parent(){
        System.out.println("parent");
    }
    public parent(int x){
        System.out.println("param of parent class "+x);
    }
}

class child extends parent{
    public child(){
        System.out.println("child");
    }
    public child(int x){
        //super(x);
        System.out.println("param of child class "+x);
    }
}

public class workingParameterConstructor {
    
    public static void main(String[] args) {
        child c = new child(10);
        //when we apply super , toh parent ka parameter constructor call hua
        // output --> param of parent class   param of child class
        // if we don't use super, toh parent ka default constructo will call
        // output --> parent    param of child class
    }

}

// NOTE:

// bhai child class ka constructor banane sai phle, parent class ka constructor hona zaruri hai ??

// Bhai, haan ✅, parent class me constructor hona zaruri hai — lekin thoda dhyaan se samajh:

// 1. Agar tum kuch bhi constructor nahi likhte ho (parent class me)

// Compiler automatically ek default constructor (no-arg constructor) bana deta hai.

// Is case me child class bina problem ke ban jaayegi.

// Example (Java me):

// class Parent {
//     // yaha koi constructor nahi likha → compiler apna default Parent() bana dega
// }

// class Child extends Parent {
//     Child() {
//         System.out.println("Child constructor");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Child c = new Child();  // valid hai
//     }
// }


// Output:

// Child constructor

// 2. Agar tum parent me constructor likh dete ho (parameterized)

// Fir compiler default constructor nahi banayega.

// Child class ke constructor se explicitly parent constructor call karna zaruri hai (super(...) use karke).

// Example:

// class Parent {
//     Parent(int x) {
//         System.out.println("Parent constructor, x = " + x);
//     }
// }

// class Child extends Parent {
//     Child(int x, int y) {
//         super(x);   // parent constructor call karna compulsory hai
//         System.out.println("Child constructor, y = " + y);
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Child c = new Child(10, 20);
//     }
// }


// Output:

// Parent constructor, x = 10
// Child constructor, y = 20


// 👉 Agar super(x) nahi likhte, to error aayega (jo tumhe pehle mila tha: "Implicit super constructor undefined...").

// 🔑 Conclusion:

// Parent class ka constructor hamesha run hota hai child ke constructor se pehle.

// Agar parent ka default constructor available hai, to automatically call ho jaata hai.

// Agar parent me sirf parameterized constructor hai, to child class ke constructor me super(...) likhna mandatory hai.