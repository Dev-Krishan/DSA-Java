/*
 * PRINT ELMENTS IN AN ARRAY
 */
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= scn.nextInt();
        int[] arr = new int[n];
       
        System.out.println("Enter the elements in array");
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        display(arr, 0);
        scn.close();
    }
    static void display(int [] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        display(arr, idx+1);
    }
}
