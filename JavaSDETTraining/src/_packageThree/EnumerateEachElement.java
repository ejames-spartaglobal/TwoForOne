package _packageThree;

public class EnumerateEachElement
{
    public static void main(String[] args) {
        double[] myList= new double[5];

        for(int i = 0; i < myList.length; i++){
            myList[i] = Math.round(Math.random() * 100);
        }

        //To display the array by showing each element
        for(int i = 0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }
    }
}
