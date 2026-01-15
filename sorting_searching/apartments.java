package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        //n = no. of applicants, m = apartments, k = max difference permissible
        int[] req = new int[n];
        int[] app = new int[m];
        for(int i = 0; i < n ;i++) req[i] = sc.nextInt();
        for(int i = 0; i < m ;i++) app[i] = sc.nextInt();

        Arrays.sort(req);Arrays.sort(app);

        int applicant = 0, appartment = 0, res = 0;
        while(applicant < n && appartment < m) {
            if(app[appartment] > k - req[applicant] && app[appartment] < k + req[applicant]) {
                res++;
                appartment++;applicant++;
            } else if(app[appartment] < k - req[applicant]) appartment++;
            else applicant++;
        }
        System.out.println(res);
    }
}
