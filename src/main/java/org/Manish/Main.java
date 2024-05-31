package org.Manish;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int [] number = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(number, 3)));


    }

        public static int[] twoSum(int[] nums, int target) {

            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                int check = target -nums[i];
                if(map.containsKey(check))
                {
                   return new int[]{ map.get(check),i};

                }else
                {
                    map.put(nums[i],i);
                }
            }
return new int[]{0,0,0};
        }
    }
