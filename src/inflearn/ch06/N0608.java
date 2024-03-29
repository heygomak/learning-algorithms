package inflearn.ch06;

import java.util.Arrays;
import java.util.Scanner;

// Binary Search
public class N0608 {
    private int solution(int n, int m, int[] arr) {
        int mid = 0, lt = 0, rt = n - 1;
        Arrays.sort(arr);

        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if(arr[mid] == m) return mid + 1;
            else if (arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }

        return mid;
    }

    public static void main(String[] args) {
        N0608 T = new N0608();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
