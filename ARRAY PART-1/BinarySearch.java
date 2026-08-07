import java.util.*;
public class BinarySearch
{
    public static int binary_search(int arr[],int key)
    {
        int start=0;
        int end=(arr.length)-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if (arr[mid]>key)//10 20 30 40 50, key=20,30>20->end=mid-1,0 to 1 index,(0+1)/2=1,arr[1]=20
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
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

        int result= binary_search(arr, key);

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
