import java.util.Arrays;
import java.util.Scanner;

public class P002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

            sum += arr[i];
        }

        System.out.println(sum * 100 / max / n);

    }
}
