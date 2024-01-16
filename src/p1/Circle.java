package p1;

import java.util.Scanner;

/*
 Java program to find the area of a circle
 */
 
public class Circle 
{
    public static void main(String[] args) 
    {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle: "+area);
    }            
}
