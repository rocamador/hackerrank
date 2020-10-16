import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution1 {

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
        System.out.println(lst.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        scanner.close();
    }
}