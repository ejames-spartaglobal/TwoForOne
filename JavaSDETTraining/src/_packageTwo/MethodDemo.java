package _packageTwo;

public class MethodDemo
{
    public static int max(int num1, int num2){

        int result;
         if(num1>num2){
             result = num1;
         } else{
             result=num2;
         }

        return result;
    }

    public static void main(String[] args) {
        //Entry point of the application
        int z = max(2,3);
        System.out.println(z);
        System.out.println(max(7,2));
    }
}
