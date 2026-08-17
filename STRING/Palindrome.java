import java.util.*;
public class Palindrome 
{
    public static boolean isPalindrome(String str)
    {

        for(int i=0;i<str.length();i++)
        {
            char start=Character.toLowerCase(str.charAt(i));
            char end=Character.toLowerCase(str.charAt(str.length()-1-i));

            if(start!=end)
            {
                return false;
            }
            
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to check palindrome:");
        String str=sc.nextLine();
        System.out.println("Is the String palindrome: "+isPalindrome(str));


    }
}
