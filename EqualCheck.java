import java.util.*;
public class EqualCheck 
{
    public static void main(String args[])
    {
        String str1="Tonny";
        String str2="Tonny";
        String str3=new String("Tonny");
        //== used ->check value only
        if(str1==str2)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
        //for s1 & s3
        
        if(str1==str3)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }

        //.equals()->check reference

        if(str1.equals(str3))
        {
            System.out.println("Strings are equal");
        }
         else
        {
            System.out.println("Strings are not equal");
        }


    }
}
