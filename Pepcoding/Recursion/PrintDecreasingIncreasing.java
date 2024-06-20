/*
 * TASK
 * To print number in decreasing and the increasing order
 * using recursion..
 */


import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        helper(n);
        scn.close();
    }
    static void helper(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        helper(n-1);
        System.out.println(n);
    }
}
