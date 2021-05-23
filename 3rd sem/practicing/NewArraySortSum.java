package practicing;

import java.util.Arrays;

public class NewArraySortSum {
    public static void main(String[] args) {
        int a[] = {10, 1, 2, 7, 6, 1, 5};
        int b = 8;
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i);
        }
        int l = 0;//index initialize
        int r = a.length - 1;//last value of array
        while (l < r) {
            if (a[l] + a[r] == b) {
                System.out.print("[" + a[l] + "," + a[r] + "]");
                break;
            } else if (a[l] + a[r] < b) {
                l++;
            } else {
                r--;
            }
        }

    }
}
