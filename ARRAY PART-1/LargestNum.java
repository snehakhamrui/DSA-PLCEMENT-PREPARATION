import java.util.*;
public class LargestNum
{
    public static int largest(int arr[])
    {
        int largest=Integer.MIN_VALUE; // value=-infinity
        
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
         }
         return largest;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

         System.out.println("Enter Array Size:");

         int size=sc.nextInt();

         int arr[]=new int[size];
         
         System.out.println("Enter Array Elements:");

         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt();
         }
        int large= largest(arr);
        System.out.println("Largest Value is:" + large);

    }
    
}
