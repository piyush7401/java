import java.util.*;

public class JaggedArray {
    public static void main(String args[]) {
        int arr[][] = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        Arrays.sort(arr[1]); //we can sort 1d array

        for (int x[] : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
