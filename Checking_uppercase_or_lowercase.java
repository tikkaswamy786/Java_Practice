import java.util.Scanner;
public class Checking_uppercase_or_lowercase
{
public static void main(String args[])
{
    char ch;
 Scanner scan=new Scanner(System.in); 
System.out.println("Enter the character  ");
ch=scan.next().charAt(0);
if(ch>='A' && ch<='Z')
{
    System.out.println(ch+" is an upper case letter ");
}
else if(ch>='a' && ch<='z')
{
    System.out.println(ch+" is a lower case letter ");
}
else
{
    System.out.println(ch+" is not a Alphabets ");
}
}
}