package _packageOne;

public class Exercise4
{
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            for(int a = 5;a>=i;a--){
                System.out.print(" ");
            }
            //System.out.println("*");
            for(int b = 0;b<=i;b++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
