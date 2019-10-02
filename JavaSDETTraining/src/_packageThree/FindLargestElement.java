package _packageThree;

import java.util.Arrays;

public class FindLargestElement
{

    public static void main(String[] args)
    {

        double[] myList = new double[800];

        for (int i = 0; i < myList.length; i++)
        {

            myList[i] = Math.round(Math.random() * 10_000);

        }

        System.out.println(Arrays.toString(myList));

        //To find the largest element
        double max = myList[0];

        for (int i = 0; i<myList.length; i++){

            if(myList[i] > max){max=myList[i];}

        }
        System.out.println("\n" + max);

    }

}
