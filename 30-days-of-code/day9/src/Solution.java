import java.util.Scanner;

public class Solution {

    // Complete the factorial function below.
    static int factorial(int n) {
        if (n >= 1)
            return n * factorial(n - 1);
        return 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        int result = factorial(n);
        System.out.println(result);

    }
}
