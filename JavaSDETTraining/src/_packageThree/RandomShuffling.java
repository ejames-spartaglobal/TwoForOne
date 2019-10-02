package _packageThree;

import java.util.Arrays;

public class RandomShuffling
{
    public static void main(String[] args) {

        int[] myNumberArray = {5,9,6,3,14,32,45,33};

        //To shuffle this array randomly:
        for(int i = 0; i < myNumberArray.length; i++){
            //To generate an index j randomly:
            int j = (int) (Math.random() * myNumberArray.length);//int bracketed as random usually uses double so it is casted
            //To swap myNumberArray[i] with [j]

            int temp = myNumberArray[i];
            myNumberArray[i]=myNumberArray[j];
            myNumberArray[j]=temp;

        }
        System.out.println(Arrays.toString(myNumberArray));
    }
}
