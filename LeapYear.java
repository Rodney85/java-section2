package Years;

import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            //ask user for the year
            System.out.print("Enter Any Year: ");
            int year = input.nextInt();

            if (year % 4 == 0)
            {
                System.out.print(year + " :Its a Leap Year\n");
            }
            else System.out.print(year + " :Its not a Leap Year\n");
        }
    }
}
