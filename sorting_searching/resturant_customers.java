package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class resturant_customers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] in = new int[2 * n][2];
        for(int i = 0; i < n; i++) {
            int arrive = sc.nextInt();
            int leave  = sc.nextInt();

            // store arrival
            in[i][0] = arrive;
            in[i][1] = 1;

            // store departure
            in[i + n][0] = leave;
            in[i + n][1] = -1;
        }


        Arrays.sort(in, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });
        int res = 0;
        int c = 0;
        for(int i = 0 ; i < 2 * n; i++) {
            c += in[i][1];
            res = Math.max(res, c);
        }
        System.out.println(res);
    }
}
