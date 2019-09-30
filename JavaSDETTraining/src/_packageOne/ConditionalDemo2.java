package _packageOne;

public class ConditionalDemo2
{
    public static void main(String[] args) {
        int val1 = 1;
        int val2=2;
        int result;
        boolean someCondition = true;
        result = someCondition ? val1:val2; //if....then...else.
        System.out.println(result);
        result = !someCondition ? val1:val2; //if....then...else.
        System.out.println(result);

    }
}
