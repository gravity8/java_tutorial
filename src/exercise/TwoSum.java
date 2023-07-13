package exercise;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
            int[] nums = {3,2,4};
            int target = 6;
            TwoSum(nums,target);
    }
    public static int[] TwoSum(int[] nums,int target){
        HashMap<Integer,Integer> keyValueList = new HashMap<Integer, Integer>();
        int[] twoSum = new int[2];
        for(int i=0; i<nums.length; i++){
                //see if it's the remainder needed for past indices,
                if(keyValueList.containsKey((target-nums[i]))){
                    //push its index to an array  and use it to access second index in the hashmap
                    return new int[]{keyValueList.get(target-nums[i]),i};
                }
                keyValueList.put(nums[i],i);
        }
        return twoSum;
    }
}
