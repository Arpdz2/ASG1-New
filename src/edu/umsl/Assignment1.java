/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author arpdz2
 */
public class Assignment1 
{
    public void Prod() throws IOException 
    {
        
       double total = 1;
        
        System.out.print("Enter your values on one line to calculate the product of them, 0 to quit: ");
       
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer( line );
      
        while (st.hasMoreTokens())
             {
                double a = Double.parseDouble( st.nextToken());
               
                if(a > 0)
                        {
                            total *= a;
                        }
               else if (a < 0)
                        {
                        
                        }
               else if (a == 0)
                        {
                  System.exit(1);
                        }
             }
        
             System.out.println("");
             System.out.println("The product is " + total);       
             System.out.println("");
     }
    
    public void CountT() throws IOException 
    {
        int first = 0;
        int last = 0;
        int count = 0;
        int nocount = 0;
        int yescount = 0;
        
        
        
        System.out.print("Enter your integer values on one line to get the first and last index of 12: ");
       
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer( line );
        
        int entries = st.countTokens();
        
        while(st.hasMoreTokens() )
            {

                int a = Integer.parseInt(st.nextToken());

                count++;
                
                if (a != 12)
                {
                    nocount++;
                }
                else
                {
                    yescount++;
                }
                
                
                if(first==0)
                {
                    if(a == 12)
                    {
                        first = count;
                        last = count;                  
                    }
                }
                else 
                {
                    if(a == 12)
		    {
                        last = count;                           
    	            }
                }
             } 
        
           if (nocount == entries)
           {
           System.out.println("");
           System.out.println("0 occurrences of the number 12 were found.");
           System.out.println("");
           }
           else
           {
           System.out.println("");
           System.out.println(yescount + " number of 12s were entered in total.");
           System.out.println("The first occurrence of the number 12 is located at index " + first + ".");
           System.out.println("The last occurrence of the number 12 is located at index " + last + "."); 
           System.out.println("");
           }
    }  
    
    public void MinMA() throws IOException
    {
         double avg = 0;
         double min = 999999999;
         double max = -999999999;
        
        System.out.print("Enter your values on one line to calculate Max, Min, and Average: ");
       
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer( line );
        
        int entries = st.countTokens();
      
        while (st.hasMoreTokens())
            
        {
            double a = Double.parseDouble(st.nextToken()); 
            avg = (avg + a); 
           
            if (a < min)
            {
                min = a;
            }
            else 
            {
                min = min;
            }
            
            if (a > max)
            {
                max = a;
            }
            else 
            {
                max = max;
            }
            
        }
        avg = avg / entries;
        
        System.out.println("");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);
        System.out.println("");
      
    }
    
    public void Grad() throws IOException 
    {
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int sumD = 0;
        int sumF = 0;
        
        
        
        System.out.print("Enter your grades on one line to calculate how many of each letter grade has been earned: ");
       
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer( line );
        
        
      
        while (st.hasMoreTokens())
        {
            int a = Integer.parseInt( st.nextToken() );
            
            if(a>=90)
            {
                System.out.println("A score of " + a + " is an A.");
                sumA++;
	    }
            else if(a >= 70)
            {
                System.out.println("A score of " + a + " is a B.");
                sumB++;
            }
            else if(a >= 50)
            {
                System.out.println("A score of " + a + " is a C.");
                sumC++;                
            }
            else if(a >= 35)
            {
                System.out.println("A score of " + a + " is a D.");
                sumD++;                
            }
            else
            {
                System.out.println("A score of " + a + " is a F.");
                sumF++;             
            }

        }
        
        System.out.println("The total number of A's is " + sumA );
        System.out.println("The total number of B's is " + sumB );
        System.out.println("The total number of C's is " + sumC );
        System.out.println("The total number of D's is " + sumD );
        System.out.println("The total number of F's is " + sumF );
        System.out.println("");
    }
    
}
