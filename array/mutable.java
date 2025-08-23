import java.util.*;

public class mutable{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr1[] = new int[5];
        for(int i =0;i<n;i++){
            arr1[i] = s.nextInt();
        }

        int arr2[] = arr1;  // 2 refernce point same object
        System.out.println("reference od arr1 "+arr1+" refernce of arr2"+arr2);
        arr1[2] = 10; //modify the arr1
        System.out.println("reference od arr1 "+arr1+" refernce of arr2"+arr2); //ab naye wale object ko ppoint krenge
        System.out.println("value arr1[2] "+arr1[2]+" and arr2[2] "+arr2[2]);
    }
}