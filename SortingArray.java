import java.util.Arrays;

class SortingArray
{
    public static void Pair(int num[],int goal)
    {
        Arrays.sort(num);

        int min=0;
        int max= num.length-1;

        while (min<max)
        {
            if(num[min]+num[max]==goal)
            {
                System.out.printf("Pair Found(%d,%d)",num[min],num[max]);
                return;
            }
            if(num[min]+num[max]<goal)
            {
                min++;
            }
            else
            {
                max++;
            }
        }
        System.out.println("Pair not Found");

    }

    public static void main(String args[])
    {
        int num[]={5,1,3,2,7,8};
        int goal=10;

        Pair(num,goal);
    }
}
