import java.util.*;
public class LinearSearch
{
    public static int linear_search(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==key)
            {
                return i;
            }
        }
        return -1;
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
          System.out.println("Enter key:");
         int key=sc.nextInt();

        int result= linear_search(arr, key);

        if (result==-1)
        {
            System.out.println("Key is not present");
        }
        else
        {
          System.out.println("Key is  present at index:"+ result);   
        }



    }
   
    
}
