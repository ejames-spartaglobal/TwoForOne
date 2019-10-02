package _packageThree;

import java.util.Arrays;

public class InitialiseWithRandomValue
{

    public static void main(String[] args) {
        double[] myList=new double[5];

        //Initialising array with random numbers

        for (int i = 0; i<myList.length; i++){
            myList[i]=Math.random()*100;
            double x = myList[i];
            myList[i]= Math.round(x*100d)/100d;

        }

        //To display array contents
        System.out.println(Arrays.toString(myList));

    }

}
