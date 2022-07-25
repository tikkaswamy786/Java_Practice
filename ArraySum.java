/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.*;
public class ArraySum 
{
   public static void main(String args[])
  {
      System.out.println("Enter the required size of the array : ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      System.out.println("Enter the "+10+" elements:");
      int myArray[] = new int [size];
      int sum = 0;
      for(int i=0; i<size; i++)
      {
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      System.out.println("Sum of array elements is : "+sum);
   }
}

//Define the main method

//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result


