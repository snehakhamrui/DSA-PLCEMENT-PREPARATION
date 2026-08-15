import java.util.*;
public class SubArray
{
    public static void subarray(int arr[])
    {
        int ts=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                     
                    
                }
                System.out.println("Sum: "+sum);
                sum=0;
                ts++;
               
                System.out.println();
            }
             System.out.println();
        }
        System.out.println("Total Subarry: "+ts);
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
         subarray(arr);
        }

}
