import java.util.*;
class Number_of_digits
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n,b,count=0;
      System.out.println("Enter number: ");
      n=sc.nextInt();
      while(n!=0)
      {
        b=n%10;
        count++;
        n=n/10;0
      }
      System.out.println("Total digits= "+count);
    }
  }