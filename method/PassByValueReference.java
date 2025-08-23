import java.util.*;

public class PassByValueReference{

    static void change_String(String s){
        s += "world";
    }
    static void change_Array(int a[]){
        a[2] = 30;
    }
    static void change_value(int x){
        x = 20;
    }

    public static void main(String args[]){
        String s = "hello";
        System.out.println(s);  //it pass the object(reference) but not change string are immutable
        change_String(s);
        System.out.println(s);

        int a[] = {1,2,3};

        System.out.println(a[2]);  // it pass the object(reference) then it changed 
        change_Array(a);
        System.out.println(a[2]);

        int x= 10;

        System.out.println(x); // it pass by value as int is primitive datatype
        change_value(x);
        System.out.println(x);
    }
}