import java.util.*;

class parent{
    public parent(){
        System.out.println("parent");
    }
}

class child extends parent{
    public child(){
        System.out.println("child");
    }
}

public class WorkingConstructor {
    
    public static void main(String[] args) {
        child c = new child();
        // output --> parent child
        // means creation of an oject of child class,first parent constructor call then child constructor call.
    }

}
