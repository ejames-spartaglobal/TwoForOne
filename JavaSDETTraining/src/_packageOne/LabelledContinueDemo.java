package _packageOne;

public class LabelledContinueDemo
{
    public static void main(String[] args) {
        String myPhrase = "Look for a substring in me";
        String subString = "ubs";
        boolean foundIt = false;
        System.out.println(subString.length());
        int max = myPhrase.length()-subString.length();

        test:
        for(int i = 0; i<=max; i++){
            int n = subString.length();//3
            System.out.println(n);
            int j=i;//0
            System.out.println(j);
            int k = 0;//0
            System.out.println(k);
            while(n--!=0){//2
                if(myPhrase.charAt(j++) != subString.charAt(k++)){
                    continue test;// labelled continue
                }
            }
            foundIt = true;
            break test;
        }

        System.out.println(foundIt ? "Found it":"Not found it" );
    }
}
