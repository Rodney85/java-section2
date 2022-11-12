package javaMethods;

import java.util.Scanner;

public class methods {
   public static void main(String[] args) {

    try(Scanner input = new Scanner(System.in)){
        //declare variable 
        int A1;
        int A2;
        int A3;

        int smallest;
        int largest;

        //ASKING USER FOR INPUT

        System.out.print("Enter 3 Numbers by spaces: ");
        A1 = input.nextInt();
        A2 = input.nextInt();
        A3 = input.nextInt();

        input.close();

        //GETTING THE SMALLEST NUMBER

        smallest = A1;
        if (A2<smallest)
        {
            smallest=A2;
        }
        if(A3<smallest)
        {
            smallest=A3;
        }

        //GETTING THE LARGEST

        largest=A1;
        if (A2>largest)
        {
            largest=A2;
        }
        if (A3>largest)
        {
            largest=A3;
        }

        //PRINTING THE OUTPUT

        System.out.print("The smallest number is\n" + smallest);
        System.out.print("\nThe largest number is\n" + largest+"\n");
        System.out.print(largest + " is your largest number and " 
        + smallest + " is your smallest number\n");
        
        

    }
    
   } 
}
