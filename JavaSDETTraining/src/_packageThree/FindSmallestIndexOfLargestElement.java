package _packageThree;

public class FindSmallestIndexOfLargestElement
{
    public static void main(String[] args) {

        //We are using array initialiser:
        int[] myNumbersArray={2,5,7,5,9,3,2,9,8,9};

        //To find the smallest index of the largest elements:
        int max = myNumbersArray[0];
        int indexOfMax=0;

        for(int i = 0;i < myNumbersArray.length; i++){

            if(myNumbersArray[i] > max){
                max=myNumbersArray[i];
                indexOfMax=i;
            }

        }
        System.out.println(indexOfMax);

    }
}
