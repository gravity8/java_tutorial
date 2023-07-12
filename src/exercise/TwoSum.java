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
            if (i>0){
                //see if it's the remainder needed for past indices,
                if(keyValueList.containsKey(nums[i])){
                    //push its index to an array  and use it to access second index in the hashmap
                    int positionInHashMap=keyValueList.get(nums[i]);
                    twoSum[0]=positionInHashMap;
                    twoSum[1]=i;
                    return twoSum;
                }
                //if it's not push its remainder and index to the hashmap and
                else {
                    keyValueList.put((target-nums[i]), i);
                }
            }
            else{
                keyValueList.put((target-nums[i]),i);
            }
        }
        return twoSum;
    }
}
