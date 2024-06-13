package Palindrome;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x){
        String temp = String.valueOf(x);
        StringBuilder reversedTemp = new StringBuilder();
        for(int i = temp.length() - 1; i >= 0; i--){
            reversedTemp.append(temp.charAt(i));
        }
        return temp.equals(reversedTemp.toString());
    }
}