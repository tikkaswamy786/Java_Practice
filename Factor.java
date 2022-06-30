import java.util.*;
public class Factor
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    int counter=1;
    for(int i=1;i<=num;i++)
      {
        counter=counter*i;
      }
    System.out.println("Factor: "+counter);
  }
}
//counter=1 i=1 1*1=1
//counter=1 i=2 2*1=2
//counter=2 i=3 3*2=6
//counter=6 i=4 6*4=24
//counter=24 i=5 24*5=120