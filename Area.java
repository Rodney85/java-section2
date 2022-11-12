package Calculation;

import java.util.Scanner;

public class Area
{
      //RECTANGLE
      static double RectangleArea(double wid,double leng)
      {
          return (leng * wid);
      }   
    //TRIANGLE
    public static double TriangleArea(double Bas, double Hei)
    {
        return(Bas * Hei);
    }
   
   
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
             // triangle both base and height
            System.out.println("Every the base of Triangle");
            double Bas= input.nextDouble();
            System.out.println("Every the height of Triangle");
            double Hei = input.nextDouble();


             //length of rectangle
             System.out.println("Every the length of Rectangle");
             double leng = input.nextDouble();
             //width of rectangle
             System.out.println("Every the width of Rectangle");
             double wid = input.nextDouble();
 

            //TOTAL AREA OF A RECTANGLE

            double AreaRectangle = RectangleArea(wid, leng);
            System.out.println("Rectangle Area is :" + AreaRectangle);

            // TOTAL AREA FOR TRIANGLE

            double AreaTriangle = TriangleArea(Bas, Hei);
            System.out.println("Triangle Area is: " + AreaTriangle);


        }
    }
}