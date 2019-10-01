package _packageOne;

public class UnlabelledBreakDemo
{
    public static void main(String[] args) {
        int[] arrayOfInts = {32,87,3,589,12,1079,2000,8,622,127};
        int searchFor = 66;
        int i;
        boolean foundIt=false;

        for(i=0;i<arrayOfInts.length;i++){
            if(arrayOfInts[i]==searchFor){
                foundIt=true;
            }
        }
        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        }

        else{
            System.out.println(searchFor + "not in the array");
        }

    }
}
