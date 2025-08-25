package method;
import java.util.*;

public class GcdTwoNumber {

    static int gcd(int a,int b){
        while(a > 0 && b > 0){
            if(a > b){
                a = a-b;
            }
            else{
                b = b -a;
            }
        }
        return Math.max(a, b);
    }

    public static void main(String args[]){
        int a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        System.out.println(gcd(a,b));
    }
}
