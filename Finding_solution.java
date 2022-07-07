import java.util.*;
class Finding_solution
  {
    public static void main(String args[])
    {
       int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row size");
      n=sc.nextInt();
      //declare
      int[][]  arr=new int[n][n];
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("************* 2 Dimenssion************");
      int count=0;
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
            {
              if((arr[i][j])<10 || arr[i][j]==20)
              { 
              count++;
              }
            }
        }
      if(count==0)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
  }