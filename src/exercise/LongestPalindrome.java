package exercise;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String letter = "abccccdd";
        Map<Character,Integer> myMap = new HashMap();
        for(char c:letter.toCharArray()){
            myMap.put(c,myMap.getOrDefault(c,0)+1);
        }
        int result = 0;
        boolean odd_found = false;
        for( int c : myMap.values()){
            if(c%2==0){
                result+=c;
            }
            else{
                odd_found = true;
                result+=c-1;
            }
            if(odd_found){
                result++;
            }
        }
        System.out.println(result);
    }
}
