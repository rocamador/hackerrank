import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    private static String mixString(String str) {
        StringBuilder res = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
                res.append(str.charAt(i));
            else
                odd.append(str.charAt(i));
        }
        return res.append(" ").append(odd).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            words.add(sc.next());
        }
        sc.close();
        for ( String x : words ) {
            System.out.println(mixString(x));
        }

    }
}