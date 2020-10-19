import java.util.Scanner;

public class Solution {

    public static int maxConsecutiveOnes(int n) {
        String s = Integer.toBinaryString(n);
        //System.out.printf("%s (%s)\n", s, n);
        int max = 0;
        int curr = 0;

        for (char ch: s.toCharArray()) {
            if (ch == '1')
                curr++;
            else {
                curr=0;
            }
            if (max < curr)
                max = curr;
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        System.out.println(maxConsecutiveOnes(n));
    }
}