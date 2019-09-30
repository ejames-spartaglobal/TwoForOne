package _packageOne;

public class ComparisonDemo
{

    public static void main(String[] args) {
        int value1=1;
        int value2=2;
        if (value1==value2)
        {
            System.out.println("value1==value2");
        }
        if(value1>value2)
        {
            System.out.println("value1>value2");
        }
        if(value1!=value2)
        {
            System.out.println("value1!=value2");
        }
        if(value1<value2)
        {
            System.out.println("value1<value2");
        }
        if(value1<=value2)
        {
            System.out.println("value1<=value2");
        }

        System.out.println();

        String myVar1 = "Sparta";
        String myVar2 = "Edward";

        System.out.println(myVar1.equals(myVar2));

        String myVar3 = "Sparta";
        System.out.println(myVar1.equals(myVar3));

    }
}
