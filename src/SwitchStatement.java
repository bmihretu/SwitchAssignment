import java.util.Scanner;

public class SwitchStatement {
    public static void main(String [] args){
        int numDays = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of days: ");
        numDays = keyboard.nextInt();

        String months = " ";
        switch (numDays){
            case 28: months = "February";
                break;
            case 29: months = "February";
                break;
            case 30: months = "September, April, June, and November";
                break;
            case 31: months = "January, March, May, July, August, October, December";
                break;
            default: months = "No months with " + numDays + " days";
        }

        System.out.println(months);

    }
}