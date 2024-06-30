/*
 * Task
 * Find the first occurance of element in an array.
 */

import java.util.Scanner;

public class FirstIndexOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= scn.nextInt();
        int[] arr = new int[n];
       
        System.out.println("Enter the elements in array");
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(findOccurance(arr, 0, 6));
        scn.close();
    }
    static int findOccurance(int[] arr, int idx, int ele){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==ele){
            return idx;
        }
        return findOccurance(arr, idx+1, ele);
    }
}
