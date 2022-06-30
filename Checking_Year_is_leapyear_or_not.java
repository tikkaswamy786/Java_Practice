import java.util.Scanner;
class Checking_Year_is_leapyear_or_not
{
    public static void main(String args[])
    {
        int year;
        System.out.println("Enter a year:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Entered year is leap year");
        }
        else
        {
            System.out.println("Entered year is non-leap year");
        }
    }
}