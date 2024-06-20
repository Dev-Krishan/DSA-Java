/*
 * SPAN OF ARRAY
 * We need to find the difference in min and max 
 * of array of n size
 */

import java.util.Scanner;

public class SpanOfArray{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        helper(arr);
    }

    static void helper(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min =arr[i]; 
            }
        }
        System.out.println(max-min);
    }
}