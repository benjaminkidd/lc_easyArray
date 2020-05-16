//Implement strStr().
//
//        Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//        Example 1:
//
//        Input: haystack = "hello", needle = "ll"
//        Output: 2
//        Example 2:
//
//        Input: haystack = "aaaaa", needle = "bba"
//        Output: -1

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String haystack = "hello";
        String needle = "ll";

        assert(strStr(haystack,needle) == 2);
    }

    public static int strStr(String haystack, String needle){
        char[] hayArr = haystack.toCharArray();
        char[] needArr = needle.toCharArray();
        int hLength = haystack.length();
        int temp = -1;
        int j = 0;

        for(int i = 0; i < hLength - 1; i++){
            System.out.println("i = " + i);
            if(hayArr[i] == needArr[j]){
                System.out.println("inside: " + j);
                temp = i-j;
                j++;
            }
        }

        System.out.println("temp " + temp);
        return temp;
    }
}
