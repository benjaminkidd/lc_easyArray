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
        String needle = "lo";

        assert(strStr(haystack,needle) == 3);
    }

    public static int strStr(String haystack, String needle) {
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int output = -1;
        output = haystack.isEmpty() ? -1 : -1;
        output = needle.isEmpty() ? 0 : -1;
        char letter;
        int j = 0;
        for(int i = 0; i < haystack.length() - 1; i++) {
            System.out.println("for i = " + i);
            System.out.println("hay length = " + haystack.length());
            if(haystackArr[i] == needleArr[j]){
                int k = i;
                while(j < needle.length() - 1){
                    output = haystackArr[k - j] == needleArr[j] ? i : -1;
                    System.out.println("k = " + k);
                    System.out.println("i = " + i);
                    System.out.println("haystack k - j = " + haystackArr[k-j]);
                    System.out.println("needle j  = " + needleArr[j]);
                    System.out.println("output = " + output);
                    j++;
                    k++;
                }
                j = 0;
            }
        }
        System.out.println("temp " + output);
        return output;
    }

}
