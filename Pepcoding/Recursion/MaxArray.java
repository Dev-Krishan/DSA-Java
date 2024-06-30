/*
 * Task
 * Find thr maxm in an array
 */

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= scn.nextInt();
        int[] arr = new int[n];
       
        System.out.println("Enter the elements in array");
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(findMax(arr, 0));
        scn.close();
    }

    static int findMax(int [] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int max = findMax(arr, idx+1);
        if(arr[idx]>max){
            return arr[idx];
        }
        return  max;
    }
}
