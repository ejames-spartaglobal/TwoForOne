package _packageTwo;

public class ReverseIntExercise
{
    public static void main(String[] args) {
        long num=237810967;
        Reverse(num);
    }

    public static String Reverse(long number){

        String reverse = " ";
        String numString= Long.toString(number);
        int length = numString.length();
       int reverseLength = numString.length();

        for(int i = length - 1; i>=0;i--){
            reverse = reverse + numString.charAt(i);
        }
        System.out.println(reverse);

        return reverse;
    }
}
