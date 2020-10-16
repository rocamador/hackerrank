import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<Integer> lst = new ArrayList<>();

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            lst.add( arrItem );
        }

        Collections.reverse(lst);
        for (Integer x: lst) System.out.printf("%s ", x);
        scanner.close();
    }
}