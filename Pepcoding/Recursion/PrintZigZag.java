/*4
 * PRINT ZIG ZAG - EULER TREE
 * A code to demonstrate euler tree for Left and Right call.
 */

import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter then number");
        int n= scn.nextInt();
        printZZ(n);
        scn.close();
    }
    static void printZZ(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printZZ(n-1);
        System.out.println(n);
        printZZ(n-1);
        System.out.println(n);
    }
}
