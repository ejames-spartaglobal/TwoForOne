package _packageOne;

public class ArrayDemo2
{
    public static void main(String[] args)
    {
        int[] myArray;
        myArray = new int[10];

        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;
        myArray[5] = 600;
        myArray[6] = 700;
        myArray[7] = 800;
        myArray[8] = 900;
        myArray[9] = 1000;

        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html
        int[] mySecondaryArray=new int[myArray.length];
        System.arraycopy(myArray,0,mySecondaryArray,0,myArray.length);
        for(int i = 0; i<mySecondaryArray.length;i++)
        {
            System.out.println(mySecondaryArray[i]);
        }
    }
}
