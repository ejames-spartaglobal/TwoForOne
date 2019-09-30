package _packageOne;

import java.util.Scanner;

public class PalindromeChecker
{
    public static void main(String[] args) {
        String word;
        String reverse="";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word to check it's a palindrome: ");
        word= input.nextLine();

        int length = word.length();

        for(int i = length - 1; i>=0;i--){
            reverse = reverse + word.charAt(i);
        }

        if(word.equals(reverse)){
            System.out.println("The word is a palindrome");
        }
        else{
            System.out.println("The word isn't a palindrome");
        }
    }
}
