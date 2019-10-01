package _packageTwo;

public class AnotherPassByValueDemo
{
    public static void swap(int n1, int n2){
        System.out.println("\t Inside the swap method");
        System.out.println("\t\tBefore swapping n1 is " + n1 + " n2 is " +n2);

        //we swap n1 and n2 here
        int temp=n1;
        n1=n2;
        n2=temp;

        System.out.println("\t\tAfter swapping n1 is " + n1 + " n2 is " + n2);
    }

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 16;

        System.out.println("\t\tBefore swapping num1 is " + num1 + " num2 is " +num2);
        swap(num1, num2);
        System.out.println("\t\tAfter swapping num1 is " + num1 + " num2 is " +num2);

    }
}
