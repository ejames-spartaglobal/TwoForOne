package _packageThree;

import java.util.Arrays;

public class ShiftElementLeft
{
    public static void main(String[] args) {
        int[] myNumbers={1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19};
        System.out.println(Arrays.toString(myNumbers));

        //To shift elements to the left by 1 place:
        int temp=myNumbers[0];

        for (int i = 1; i<myNumbers.length; i++){
            myNumbers[i-1]=myNumbers[i];
        }

        //To shift the first element to be the las element
        myNumbers[myNumbers.length -1]=temp;

        System.out.println(Arrays.toString(myNumbers));
    }
}
