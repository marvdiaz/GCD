// GCD.java
// Marvin Diaz
// maerdiaz@ucsc.edu
// pa3
// This program only takes positive integers and will ask for it.
// The two positive integers will be used to get the greatest common divisor

import java.util.Scanner;

class GCD{

   public static void main(String[] args){

      int a,b;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a positive integer: "); //Prompt the user to enter an input

      while(true) { // infinite while loop until a positive integer is inputted
         while(!sc.hasNextInt()) { // While loop if the input is not an integer
            sc.next(); // Get rid of the input
            System.out.print("Please enter a positive integer: "); // Tell the user to input again
         }

         a = sc.nextInt(); // Store the input in a
         if(a>0) break; // If the input is positive break from the while loop

         System.out.print("Please enter a positive integer: "); // Tell the use to input again if it is negative
      }

      // This is where the second integer will be printed

      System.out.print("Please enter another positive integer: "); //Prompt use to input a second positive integer
      while(true) { // Infinite loop until a positive integer is inputted
         while(!sc.hasNextInt()) { // Run while loop if input is not an integer
            sc.next(); // Get rid of input
            System.out.print("Please enter a positive integer: ");// Tell the user to input again
         }

         b = sc.nextInt(); // store the input in b
         if(b>0) break; // If the input is positive break from the while loop
         System.out.print("Please enter a positive integer: "); // Prompt user to input a second positive integer 
      }


      int m = a, n = b, remainder;



      while(n != 0){ // While loop until the remainder is zero

         remainder = m % n; // Remainder of the two inputs
         m = n; // The number that needs to be divided by is n
         n = remainder; // The remainder will divide m and get a new remainder
      }

      System.out.println("The GCD of " + a + " and " + b + " is " + m);
   }
}
