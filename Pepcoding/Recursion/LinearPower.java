import java.util.Scanner;

public class LinearPower {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter then number");
        int x= scn.nextInt();
        System.out.println("Enter the power");
        int n = scn.nextInt();
        System.out.println(powerCalc(x,n));
        scn.close();
    }
    static int powerCalc(int x, int n){
        if(n==0){
            return 1;
        }
        return x*powerCalc(x, n-1);
    }
}
