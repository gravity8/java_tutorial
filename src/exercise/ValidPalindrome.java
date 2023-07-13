package exercise;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if(s.length()<=1) System.out.println(true);
        int start=0;
        int end=(s.length()-1);
        while(start<end){
            while(start<end&& !Character.isLetterOrDigit(s.charAt(start))) start++;
            while(start<end&& !Character.isLetterOrDigit(s.charAt(end))) end--;
            if(start<end && Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                System.out.println(false) ;
            }
            start++;
            end--;
        }
        System.out.println(true);
        }
    }
