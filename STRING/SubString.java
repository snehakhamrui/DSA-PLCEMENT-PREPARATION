import java.util.*;
public class SubString 
{
    public static String subString(String str,int si,int ei)
    {
        String sub="";
        for(int i=si;i<ei;i++)
        {
            sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();

        System.out.println("Enter Start Index:");
        int si=sc.nextInt();

        System.out.println("Enter End Index:");
        int ei=sc.nextInt();

        System.out.println("Substring is:"+ subString(str, si, ei));
    }
}
