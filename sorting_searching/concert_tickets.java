package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class concert_tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_tic = sc.nextInt(), total_cus = sc.nextInt();
        int[] p = new int[total_tic];
        for(int i = 0; i < total_tic; i++) {
            p[i] = sc.nextInt();
        }
        int[] d = new int[total_cus];
        for(int i = 0; i < total_cus; i++) {
            d[i] = sc.nextInt();
        }

        int[] res = new int[total_cus];
        Arrays.sort(p);
        boolean[] v = new boolean[total_tic];
        for(int i = 0; i < total_cus; i++) {
            int t = fn(d[i], v, p);
            while(t >= 0 && v[t]) {
                t--;
            }
            if(t != -1) {
                res[i] = p[t];
                v[t] = true;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    public static int fn(int target, boolean[] v, int[] p) {
        int s = 0, e = v.length - 1;
        int res = -1;
        while(s <= e) {
            int m = s + (e - s) / 2;
            if(p[m] <= target) {
                res = m;
                s = m + 1;
            } else e = m - 1;
        }
        return res;
    }
}
