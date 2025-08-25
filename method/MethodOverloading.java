import java.util.*;

public class MethodOverloading {

    static int max(int a,int b){
        return Math.max(a, b);
    }

    static float max(float a,float b){
        return Math.max(a, b);
    }
    public static void main(String args[]){
        int a = 1;
        int b = 13;
        System.out.println(max(a,b));
        float f1 = 12.3f;
        float f2 = 13.6f;
        System.out.println(max(f1,f2));
    }
}
