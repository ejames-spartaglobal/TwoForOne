package _packageOne;

public class VariablesDemo
{
    //Below is an example of an Instance Variable

    int a = 1;
    String myName = "Edward James";

    //Below is an example of Static Variable
    static int b = 0;
    static String myAddress = "London";
    public static void main(String[] args)
    {

        VariablesDemo object1 = new VariablesDemo();
        System.out.println(object1.myName);
        System.out.println(object1.a);
        System.out.println(myAddress);
        System.out.println(b);

        //Local Variable
        String myMessage = "From inside the main method";

        System.out.println(myMessage);
    }
}
