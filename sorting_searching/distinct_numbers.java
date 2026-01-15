package sorting_searching;

import java.util.HashSet;
import java.util.Scanner;

public class distinct_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            set.add(t);
        }
        System.out.println(set.size());
    }
}
