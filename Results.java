package Examination;

import java.util.Scanner;

public class Results
{
    //declare varibles
    //[A IS JAVA]. [B IS NETWORKING]. [C IS MATHS]
    static int A,B,C,Average;
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
           //ASKING LECTURE FOR INPUT OF 3 UNITS
           
           //java
           System.out.print(" The Marks for Java Programming: ");
           A = input.nextInt();

           System.out.print(" The Marks for Networking: ");
           B = input.nextInt(); 

           System.out.print(" The Marks for Maths: ");
           C = input.nextInt();

           //get the average
           Average = (A+B+C)/3;
           System.out.printf("The average is: "+ Average+"\n");
        }
    }
}
