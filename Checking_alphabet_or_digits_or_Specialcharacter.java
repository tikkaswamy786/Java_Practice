import java.util.Scanner;

public class Checking_alphabet_or_digits_or_Specialcharacter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
        {
             System.out.println(ch + " IS A ALPHABET.");
        } 
        else if(ch >= '0' && ch <= '9') 
        {
             System.out.println(ch + " IS A DIGIT.");
        } 
        else 
        {
             System.out.println(ch + " IS A SPECIAL CHARACTER.");
        }
    
    }
}