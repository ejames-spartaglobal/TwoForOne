package _packageTwo;

import java.util.Scanner;

public class HexToDecDemo
{

    public static int hexToDecimal(String hex){
        int decimalValue = 0;

        for(int i = 0; i <hex.length();i++){
            char hexChar=hex.charAt(i);
            decimalValue=decimalValue*16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch){
        if(ch>='A' && ch <= 'F'){
            return 10 + ch - 'A';
        }
        else return ch-'0';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hex number: ");
        String hex = input.nextLine();
        System.out.println("The decimal value for the hex number is: " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }
}
