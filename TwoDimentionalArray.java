/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/
import java.util.*;
class TwoDimentionalArray
  {
    public static void main(String args[])
    {
       int row,col;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of row and column: ");
      row=sc.nextInt();
      col=sc.nextInt();
      int[][]  arr=new int[row][col];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print("Enter arr ["+i+"]"+" ["+j+"] : ");
              arr[i][j]=sc.nextInt();
            }
        }
      int max = arr[0][0];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              if(arr[i][j]>max)
              {
                max=arr[i][j];
              }
            }
        }
      System.out.print("Largest element in array is "+max);
    }
  }
//Define the main method

//Declare the variables

//Take number of rows and columns from user in two-dimensional array

//assume first element is largest and use for loop to compare the largest element with all the reamaining elements

//Calcualte the maximum element based on index poistion

//Print result