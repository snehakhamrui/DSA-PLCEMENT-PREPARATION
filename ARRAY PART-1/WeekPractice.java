import java.util.*;
public class WeekPractice 
{
    //pairs print 
   /*  public static void pairs_print(int arr[])
    {
        int n=arr.length;
        int tp=0;
        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            for(int j=i+1;j<n;j++)
            {
                System.out.print("( "+curr+","+arr[j]+" )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Comparion:"+tp);
    }*/

        //Print Subarray
        public static void sub_arry(int arr[])
        {
            int n=arr.length;

            for(int i=0;i<n;i++)
            {
                int start=i;
                
                for(int j=i;j<n;j++)
                {
                    int end=j;
                    for(int k=start;k<=end;k++)
                    {

                    System.out.print(arr[k]+" ");

                    }
                    System.err.println();
                }
                System.err.println();
            }
        }



    public static void main(String args[])
    {
        


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        //pairs_print(arr);
        sub_arry(arr);

        //print
        /*for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        } */
        
    }
    
}
