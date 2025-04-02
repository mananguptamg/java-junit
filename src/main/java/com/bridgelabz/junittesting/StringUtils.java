package com.bridgelabz.junittesting;

public class StringUtils {
    public String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str2 = sb.toString();

        if(str.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toUppercase(String str){
        return str.toUpperCase();
    }
}
