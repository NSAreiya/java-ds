import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        int expectedSum = n * (n + 1) / 2;
        int missingNumber = expectedSum - sum;

        System.out.println("Missing number is: " + missingNumber);
    }
}
