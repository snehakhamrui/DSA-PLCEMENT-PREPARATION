import java.util.*;
public class PracticeWeek 
{
   /*  public static void brute_force(int arr[])
    {    int max_sum=Integer.MIN_VALUE;
         int curSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int start=i;
            

            for(int j=i;j<n;j++)
            {
                int end=j;
                 curSum=0;
                for(int k=start;k<=end;k++)
                {
                    curSum+=arr[k];
                }
                System.out.print(curSum +" ");
                if(max_sum<curSum)
                {
                    max_sum=curSum;
                }
            }
            System.out.println();

        }
        System.out.println("Max Sub Array Sum is:"+ max_sum);
    }*/


       /*  public static void prefix_sum(int arr[])
        {
            int curSum=0;
            int max_sum=Integer.MIN_VALUE;
            int prefix[]=new int[arr.length];
            int n=arr.length;
            prefix[0]=arr[0];


            for(int i=1;i<n;i++)
            {
                prefix[i]=prefix[i-1]+arr[i];
            }
            for(int i=0;i<n;i++)
            {
                int start=i;
                curSum=0;
                for(int j=i;j<n;j++)
                {
                    int end=j;
                    curSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                }
                System.out.print(curSum);
                if(max_sum<curSum)
                {
                    max_sum=curSum;
                }
                System.out.println();
            }
            System.out.println("Max Sum:"+max_sum);

        }*/

            public static void kadanes_algo(int arr[])
            {
                int n=arr.length;
                int curSum=0;
                int maxSum=Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++)
                {
                    curSum+=arr[i];
                    if(curSum<0)
                    {
                        curSum=0;
                    }
                    maxSum=Math.max(maxSum,curSum);
                }
                System.out.println("Max Sum:"+ maxSum);
            }
            public static void main(String args[])
    {
        int arr[]={1,-2,6,-1,3};
        //brute_force(arr);
       // prefix_sum(arr);
       kadanes_algo(arr);

    }
}
