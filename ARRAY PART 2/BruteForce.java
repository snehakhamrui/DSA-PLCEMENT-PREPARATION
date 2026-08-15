import java.util.*;
public class BruteForce 
{
    public static void maxSubarraySum(int arr[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++)
                {
                    //System.out.print(arr[k]+" ");
                    currSum=currSum+arr[k];
                    
                     
                    
                }
                System.out.println("Sum: "+currSum);
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }  
                
            }
         
        }
        System.out.println("Maximum Sum: "+maxSum);
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
         maxSubarraySum(arr);
        }    
}//Time complexcity->o(n^3)
