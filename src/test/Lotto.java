package test;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int idx = 0;

        Loop:
        while (idx < arr.length) {
            int ran = (int)(Math.random() * arr.length) + 1;

            for (int i = 0; i < idx; i++) {
                if (arr[i] == ran) {
                    continue Loop;
                }
            }
            arr[idx++] = ran;
        }
        System.out.println(Arrays.toString(arr));
    }
}
