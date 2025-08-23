import java.util.*;

public class TwoDArray {
    public static void main(String args[]){
        int n,m;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        int arr[][] = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j] = s.nextInt();
            }
        }

        for(int x[] : arr){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
