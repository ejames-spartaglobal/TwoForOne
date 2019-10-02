package _packageThree;

import java.util.Arrays;
import java.util.Scanner;

public class InitialiseWithInputValuesDemo
{
    public static void main(String[] args) {
        //To declare an array
        int[] myList = new int[10];

        //to initialise the array with values from user input

        Scanner input= new Scanner(System.in);
        System.out.println("Enter " + myList.length +" values");

        for(int i = 0; i <myList.length; i++){
            myList[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(myList));

    }
}
