package _packageTwo;

import java.util.Scanner;

public class GCDWithModular
{
    public static int gcd(int n1, int n2){
        int gcd = 1;
        int k = 2;

        while(k <= n1 && k<=n2){
            if(n1 % k == 0 && n2 % k == 0){
                gcd=k;
            }
            k++;
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter your second integer: ");
        int n2 = input.nextInt();

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1,n2));


    }
}
