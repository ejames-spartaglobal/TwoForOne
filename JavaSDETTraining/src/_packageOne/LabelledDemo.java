package _packageOne;

public class LabelledDemo
{
    public static void main(String[] args) {
        int[][] arrayOfInts={
                {32,87,3,589},
                {12,1076,2000,8},
                {622,127,77,955}
        };
        int searchFor = 12;
        int i;
        int j=0;
        boolean foundIt=false;

        search:
        for(i=0; i < arrayOfInts.length; i++){
            for(j=0; j<arrayOfInts[i].length;j++){
                if(arrayOfInts[i][j]==searchFor){
                    foundIt=true;
                    break search;//this is a labelled break
                }
            }
        }
        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i + ", "+ j);
        }

        else{
            System.out.println(searchFor + " not in the array");
        }
    }
}
