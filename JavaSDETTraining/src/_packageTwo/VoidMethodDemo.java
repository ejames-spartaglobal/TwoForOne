package _packageTwo;

public class VoidMethodDemo
{
    public static void printGrade(double score){
        if (score>=90.0){
            System.out.println('A');
        }
        else if (score >=80.0){
            System.out.println('B');
        }
        else if (score >=70.0){
            System.out.println('C');
        }
        else if (score >=60.0){
            System.out.println('D');
        }
        else{
            System.out.println('F');
        }
    }

    public static void main(String[] args) {
        System.out.println("The Grade is:");
        printGrade(78.6);
        System.out.println("The Grade is:");
        printGrade(96);
    }
}
