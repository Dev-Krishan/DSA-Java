/*
 * Task
 * Find Last Occurance of elem in array
 * Return -1 if elem not found
 */

import java.util.Scanner;

public class LastOccurance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(findOccurance(arr, 0, 3));
        scn.close();
    }

    static int findOccurance(int[] arr, int idx, int ele) {
        if (idx == arr.length) {
            return -1;
        }
        int last = findOccurance(arr, idx + 1, ele);
        if (last == -1) {
            if (arr[idx] == ele) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return last;
        }

    }
}
