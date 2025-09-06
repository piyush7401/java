import java.util.*;

//NOTE: Interface mai hm method nhi kr skte
// BUT by static keyword hm method ko define kr skte hai

interface test{
    int x = 10;  //by default static
    public abstract void meth1();
    public static void meth3(){
        System.out.println("Test interface is used for meth3");
    }
}

class my implements test{
    public void meth1(){
        System.out.println("my class is used for meth1");
    }
    public void meth3(){
        System.out.println("my class is used for meth3");
    }
}

interface tester{
    default void meth4(){
        System.out.println("interface is used for meth4");
    }
    default public void meth5(){
        System.out.println("interface is used for meth5");
    }
}

class mine implements tester{
    public void meth4(){
        System.out.println("mine class is used for meth5");
    }
}

public class Demo2{
    public static void main(String args[]){
        //NOTE: Static keyword didn't need object 
        //It is bind with class
        System.out.println(test.x);
        //yaha pr hm class sai call kr rhe hai
        test.meth3();

        //Agr mai new method krna chata hu in Interface mai 
        //Toh sare my cllass ko modified krna hoga
        //Kya kre bina hm interface new method bhi add krde and
        //my class bhi distrub nhi ho

        //We use default keyword in java is used
        
        tester t = new mine();

        t.meth4(); //mine class ka meth4
        t.meth5(); //Interface class ka meth5
    }
}
