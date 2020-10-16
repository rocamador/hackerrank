//Complete this code or write your own from scratch

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Solution{

    public static HashMap<String, Integer> phoneBook = new HashMap<>();
    public static ArrayList<String> queries = new ArrayList<>();

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (s.equals("#"))
                break;
            queries.add(s);
        }
        in.close();

        for (String x : queries) {
            Integer phone = phoneBook.get(x);
            System.out.println(phone!=null ? x + "=" + phone : "Not found");
        }
    }
}