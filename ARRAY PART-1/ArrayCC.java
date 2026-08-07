import java.util.*;
class ArrayCC
{
    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[])
    {
        //int marks[]=new int[50];//static arry->size is fixed

       /*  int numbers[]={1,2,3};
        String fruits[]={"Apple","Banana","Mango"};*/
        /*Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Physics:"+marks[0]);
        System.out.println("Chemistry:"+marks[1]);
        System.out.println("Math:"+marks[2]);
       int percentage=(marks[0]+marks[1]+marks[2])/3;
       System.out.println("Percentage:" + percentage);
       System.out.println("Array Length:"+ marks.length);*/

       int marks[]={97,98,99};//arry is used as call by reference
       update(marks);
       for(int i=0;i<marks.length;i++)
       {
            System.out.println(marks[i]);
       }


    }
}