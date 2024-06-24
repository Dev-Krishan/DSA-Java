/*
 * FACTORIAL
 * Find the factorial of the given input
 */
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter then number");
        int n= scn.nextInt();
        System.out.println(helperFunc(n));
    }

    static int helperFunc(int n){
        if(n<=1){
            return 1;
        }
        return n* helperFunc(n-1);
    }
}
