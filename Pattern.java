/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/
import java.util.Scanner;
public class Pattern 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if ((i + j) % 2 == 0) 
                {
                    System.out.print("1 ");
                } 
                else 
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
     
//Add main method here

//Declare variable n and initialize value as 5

//Check whether the i and j are equal or not using for loop

//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero



//Good Job!
//Please maintain appropriate comments in your code.