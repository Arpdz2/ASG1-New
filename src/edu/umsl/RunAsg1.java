package edu.umsl;


import java.io.IOException;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arpdz2
 */
public class RunAsg1 
{
    public static void main (String args[]) throws IOException
    {
        int number;
    do
        {
        System.out.println("1) Product");
        System.out.println("2) CountTwelve");
        System.out.println("3) MinMaxAvg");
        System.out.println("4) Grades");
        System.out.println("5) Quit");
        System.out.print("Enter the corresponding number for the program you would like to run: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
            if(number == 1)
                    {
                    Assignment1 asg1 = new Assignment1();
                    asg1.Prod();
                    }
            else if(number == 2)
                    {
                    Assignment1 asg1 = new Assignment1();
                    asg1.CountT();
                    }
            else if(number == 3)   
                    {
                    Assignment1 asg1 = new Assignment1();
                    asg1.MinMA();
                    }
            else if(number == 4)   
                    {
                    Assignment1 asg1 = new Assignment1();
                    asg1.Grad();
                    }
                
            }
    while(number != 5);
    
    System.out.println("The program is done running.");
    
    }
}
