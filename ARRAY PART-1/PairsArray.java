import java.util.*;
public class PairsArray 
{
    public static void pair(int arr[])
    {   
        int curr=0;
        int total_pairs=0;
        for(int i=0;i<arr.length;i++)
        {
            curr=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("["+curr+","+ arr[j] +"]");
                total_pairs++;
            }
            System.out.println();
            curr++;


            
        }
        System.out.println("Total Pairs: "+total_pairs);
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
         pair(arr);
        }
    
} //Time Complexcity o(n^2)
