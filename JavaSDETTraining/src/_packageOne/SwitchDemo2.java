package _packageOne;

import java.util.Scanner;

public class SwitchDemo2
{
    public static void main(String[] args) {
        int month;
        int year;
        String monthString;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the year: ");
        year=input.nextInt();
        System.out.println("Please enter month: ");
        month=input.nextInt();




        switch (month){
            case  9: case  4: case  6: case  11: monthString ="30";
                break;
            case  1: case  3: case  5: case 7: case  8: case  10: case  12: monthString = "31";
                break;
            case  2: if(year%4==0)
            {
                if(year%100==0){
                    if(year%400==0){
                        monthString="29";
                    }
                    else {monthString="28";}
                }
                else{monthString="29";}
            }
            else{monthString = "28";}
                break;
            default:monthString = "Invalid month entered";
        }

        System.out.println("Number of Days is "+ monthString);
    }
}
