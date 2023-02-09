//Find the duplicate element in a limited range array

import java.util.*;

public class DuplicateArray {

    public static int findDuplicate(int[] nums)
    {
        boolean visited[]=new boolean[nums.length+1];

        for(int value:nums)
        {
            if(visited[value])
            {
                return value;
            }
            visited[value]=true;
        }

        return -1;
    }

    public static void main(String args[])
    {
        int[] nums ={1,2,3,5,5};

        System.out.println("The Duplicate element is "+findDuplicate(nums));
    }
    
}
