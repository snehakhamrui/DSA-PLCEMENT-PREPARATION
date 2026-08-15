import java.util.*;

public class SearchKey
{
   /*  public static boolean search(int matrix[][],int key)
    {
        int minVal=Integer.MAX_VALUE;
         for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Key Element Present");
                    return true;
                }
            }
        } 
        System.out.println("Key Element Not Present");
        return false;

    }*/

    /*  public static void min_val(int matrix[][])
    {
        int minVal=Integer.MAX_VALUE;
         for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(minVal>matrix[i][j])
                {
                    minVal=matrix[i][j];
                }
            }
                
        } 
        System.out.println("Min Value: "+minVal);
        

    }*/

     public static void max_val(int matrix[][])
    {
        int maxVal=Integer.MIN_VALUE;
         for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(maxVal<matrix[i][j])
                {
                    maxVal=matrix[i][j];
                }
            }
                
        } 
        System.out.println("Max Value: "+maxVal);
        

    }

    public static void main(String args[])
    {
          int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        //System.out.println("Enter Seach key:");
        // int key=sc.nextInt();
        //search(matrix, key);
        //min_val(matrix);
        max_val(matrix);
    }
}
