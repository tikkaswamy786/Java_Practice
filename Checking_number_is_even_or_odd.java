import java.util.Scanner;
class Checking_number_is_even_or_odd
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter an integer number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Entered number is even");
        }
        else
        {
            System.out.println("Entered number is odd");
        }
    }
}