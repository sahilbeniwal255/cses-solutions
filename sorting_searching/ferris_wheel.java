package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class ferris_wheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max_weight = sc.nextInt();
        int[] w = new int[n];
        for(int i = 0; i < n; i++) w[i] = sc.nextInt();

        int res = 0;
        Arrays.sort(w);
        int i = 0, j = 0;
        while(i < j) {
            if(w[i] + w[j] < max_weight) {
                res++;i++;j--;
            } else {
                res++;
                j--;
            }
        }
        System.out.println(res);
    }
}
