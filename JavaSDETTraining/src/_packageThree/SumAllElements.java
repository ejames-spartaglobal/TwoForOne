package _packageThree;

import java.util.Arrays;

public class SumAllElements
{

    public static void main(String[] args) {

        //To store the sum, we create a variable:
        double total = 0;

        double[] myList = new double[5];

        for (int i = 0; i < myList.length; i++){

            myList[i] = Math.round(Math.random() * 100);

        }

        System.out.println(Arrays.toString(myList));

        for(int i =0; i< myList.length; i++){
            total += myList[i];

        }

        System.out.println("\n" + total);
    }

}
