import java.util.*;
public class ReverseArray
{
    public static void reverse(int arr2[])
    {
        /*int first=0, last=(arr.length)-1;
        while (first<last)
        {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;

        }*/
       //without using temp veriable and loop iterate n/2 times
       for(int i=0;i<arr2.length/2;i++)
        {
            int n=arr2.length;
            int target=n-i-1;
              
            arr2[i]=arr2[i]^arr2[target];
            arr2[target]=arr2[i]^arr2[target];
            arr2[i]=arr2[i]^arr2[target];
        } 
        
    }

    public static void main(String args[])
    {
         /*Scanner sc=new Scanner(System.in);

         System.out.println("Enter Array Size:");

         int size=sc.nextInt();

         int arr[]=new int[size];
         
         System.out.println("Enter Array Elements:");

         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt();
         }*/
         int arr2[]={1,2,3,4,5,6};
         reverse(arr2);
         for(int i=0;i<arr2.length;i++)
         {
            System.out.print(arr2[i]+" ");
         }
         System.out.println();
         

        }

}
