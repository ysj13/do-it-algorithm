import java.util.Arrays;
import java.util.Scanner;

public class P003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] sumArr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sumArr[0] = arr[0];

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp += arr[i];
            sumArr[i] = temp;
        }

        System.out.println(Arrays.toString(sumArr));
    }
}
