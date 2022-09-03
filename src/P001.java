import java.util.Arrays;
import java.util.Scanner;

public class P001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int answer = 0;

        for(int i = 0 ; i < n; i++) {
            // char -> int
            // char - '0' 을 하거나 Character.getNumericValue();
            answer += Character.getNumericValue(arr[i]);
        }

        System.out.println(answer);
    }
}
