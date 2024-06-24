/*
 * POWER BY LOGARTHMIC
 * Using log approach find ther power in log complexity
 */

import java.util.Scanner;

public class LogarthmicPower {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter then number");
        int x = scn.nextInt();
        System.out.println("Enter the power");
        int n = scn.nextInt();
        System.out.println(logPowerCalc(x, n));
        scn.close();
    }

    static int logPowerCalc(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int nHalf = logPowerCalc(x,n/2);
        int xn = nHalf * nHalf;
        if(n%2!=0){
            xn = x*xn;
        }
        return xn;
    }
}
