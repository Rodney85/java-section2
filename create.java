package StaN0n;

import java.util.Scanner;

public class create 
{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("\nEnter the first number: ");
            var A1 = input.nextInt();

            System.out.println("Enter the second number: ");
            var A2 = input.nextInt();

            System.out.println("Is " + A1 + " equal to " + A2 + "?");
            if (A1 == A2) {
            System.out.println(true);
            } else 
            {
            System.out.println(false);
            }

    
        }
    }
}
