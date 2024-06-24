/*
 * TOWER OF HANOI
 * MOVER FROM TOWER A to TOWER B with the help if TOWER C.
 */
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rings");
        int n = scn.nextInt();
        printTower(n, 10, 11,12);
        scn.close();
    }

    static void printTower(int n, int a, int b, int c) {
        if(n==0){
            return;
        }
        printTower(n-1, a, c, b); 
        System.out.println(n+"["+a + "->"+ b + "]");
        printTower(n-1, c,b,a);
    }
}
