package _packageTwo;

public class ReverseIntExercise
{
    public static void main(String[] args) {
        int num=237810967;
        Reverse(num);
    }

    public static String Reverse(int number){

        String reverse = " ";
        String numString= Integer.toString(number);
        int length = numString.length();
       int reverseLength = numString.length();

        for(int i = length - 1; i>=0;i--){
            reverse = reverse + numString.charAt(i);
        }
        System.out.println(reverse);

        return reverse;
    }
}
