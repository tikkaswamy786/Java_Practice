public class LEFT_TRIANGLE_STAR_PATTERN
{
    public static void main(String args[])
  {
    int n = 5;
    int i, j;
    for(i=0; i<n; i++) //an outer loop for number of rows(n)
    { 
      for(j=2*(n-i); j>=0; j--) // an inner loop for spaces
      {
        System.out.print(" "); // to print space
      }
      for(j=0; j<=i; j++) // an inner loop for columns
      {
        System.out.print("* "); // to print star
      }
      System.out.println(); // end-line after every row
    }
  }
}