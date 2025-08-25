import java.util.*;

public class VariableArgument {
    static void show(int ...a){
        for(int x : a){
            System.out.println(x);
        }
    }

    static void showlist(int start,String ... s){
        for(int i =0;i<s.length;i++){
            System.out.println(start+" "+s[i]);
            start++;
        }
    }

    public static void main(String args[]){
        show(1);
        show(2,3,4);
        int arr[] = {2,3,4,5,5};
        show(arr);
        showlist(0, args);
    }
}
