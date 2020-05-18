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
//        String haystack = "hello";
//        String needle = "ll";
        String haystack = "hello";
        String needle = "a";

        assert(strStr(haystack,needle) == -1);
    }

    public static int strStr(String haystack, String needle) {
        char[] hayArr = haystack.toCharArray();
        char[] needArr = needle.toCharArray();
        int hLength = haystack.length();
        int output = -1;
        if(haystack.isEmpty()){
            output = -1;
        }
        else if (needle.isEmpty()) {
            output = 0;
        }
        else {
            output = -1;
            for (int i = 0; i < hLength - 2; i++) {
                int j = -1;
                System.out.println("i = " + i);
                if (hayArr[i] == needArr[j + 1]) {
                    while (hayArr[i] == needArr[j + 1]) {
                        output = i - j + 1;
                        j++;
                    }
                }
                else{
                    output = j;
                }
            }
        }

        System.out.println("temp " + output);
        return output;
    }
}
