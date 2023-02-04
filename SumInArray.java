import java.util.*;

class SumInArrays
{
   public static void Pair(int num[],int goal)
   {
    for(int i=0;i<num.length-1;i++)
    {
        for(int j=i+1;j<num.length;j++)
        {
            if(num[i]+num[j]==goal)
            {
                System.out.printf("Pair Found (%d,%d)",num[i],num[j]);
                return ;
            }
        }
    }
    System.out.println("Pair Not Found");
   }

   public static void main(String[] args)
   {
    int num[]={5,1,3,2,7,8};
    int goal=9;

    Pair(num,goal);
    
   }
}