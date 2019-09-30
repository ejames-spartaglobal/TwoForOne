package _packageOne;

import java.util.Arrays;

public class Exercise1
{
    public static void main(String[] args)
    {
        char[] firstArray = {'p','a','s','s','w','o','r','d'};

        char[] thirdArray = new char[firstArray.length];
        //copyOfRange method
        char[] secondArray= Arrays.copyOfRange(firstArray, 4,firstArray.length);
        //arraycopy method
        System.arraycopy(firstArray, 4, thirdArray,0,firstArray.length-4);

        System.out.println(secondArray);
        System.out.println(thirdArray);
    }


}
