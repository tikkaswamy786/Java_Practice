import java.util.*;
class Find_first_and_last_digits
{
public static void main(String args[])
{
  int number=0;
        int firstDigit = 0;
        int lastDigit = 0;
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
 
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
            }
        System.out.println("First digit: "+firstDigit);
    }
}