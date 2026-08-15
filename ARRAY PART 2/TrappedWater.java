import java.util.*;
public class TrappedWater
{
    public static void rainWater(int height[])
    {
        int n=height.length;
        //calcultae left max boundary
        int leftMax[]=new int[n];
        leftMax[0]=height[0];

        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

         //calcultae Right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        // calcultae trapped water
        int trapped_water=0;
        for(int i=0;i<n;i++)
        {
            int water_level=Math.min(leftMax[i],rightMax[i]);
            trapped_water+=water_level-height[i];
        }
        System.out.println("Total Trapped Water:"+ trapped_water);


    }
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        rainWater(height);

    }
    
}
