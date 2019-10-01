package _packageTwo;

public class SortingExercise {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int num3 = 7;

        sort(num3,num2,num1);

    }

    public static void sort(int n1, int n2, int n3){
        if(n1<n2 && n1<n3){
            if(n2>n3){
        int temp = n3;
        n1=n2;
        n2=n3;
        n1=temp;
        }
            else {    int temp = n3;
                n3=n1;
                n2=n2;
                n3=temp;
            }
        }

        else if(n1<n3){
            int temp = n3;
            n3=n1;
            n1=temp;
        }
            if(n3>n2){
            int temp = n3;
            n3=n2;
            n2=temp;
        }



        System.out.println(n3 + " " + n2 + " " + n1);

    }
}
