package _packageThree;

import java.util.Arrays;

public class ShiftElementRightThree
{
    public static void main(String[] args) {

        int[] myNumbers={1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
        System.out.println(Arrays.toString(myNumbers));

        //To shift elements to the right by 1 place:
        int temp=myNumbers[myNumbers.length-2];
        int temp2=myNumbers[myNumbers.length-1];
        int temp3=myNumbers[myNumbers.length-3];
        for (int i = myNumbers.length-4; i>=0; i--){
            myNumbers[i+3]=myNumbers[i];
        }
        System.out.println(myNumbers.length);

        //To shift the last element to be the first element
        myNumbers[1]=temp;
        myNumbers[0]=temp2;
        myNumbers[2]=temp3;

        System.out.println(Arrays.toString(myNumbers));
    }
}
