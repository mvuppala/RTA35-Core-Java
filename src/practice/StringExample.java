package practice;

import java.util.Arrays;
import java.util.Objects;

public class StringExample {
    public static void main(String[] args) {
        String str = "Example String";

        //function that counts the number of characters in a string
        //System.out.println("Number of characters in the string: " + countChar(str));

        //function to iterate a string
        //System.out.print("Iterating the string: ");
        //iterateString(str);

        //function to reverse a string
        //System.out.println("Reverse of the string: " + reverseString(str));

        //function to check if a string is palindrome
        //System.out.println("String is palindrome: " + isPalindrome(str));

        //function to return in the longest word in a sentence
        //System.out.println("The longest word in the sentence is " + longestWord(str));

        //function to remove all whitespaces in a sentences
        //System.out.println("Sentence after all the whitespaces are removed: " + removeWhitespaces(str));

        //function to count the number of vowels
        //System.out.println("The number of vowels in the sentence: " + countVowels(str));

        //function to check if to 2 strings are anagrams
        System.out.println("Two strings are anagrams: " + areAnagrams("listen", "silent"));
    }

    private static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    private static int countVowels(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        str = str.toLowerCase();
        int count = 0;
        for(int i= 0; i < str.length(); i++){
            for(char v : vowels){
                if(str.charAt(i) == v){
                    count++;
                }
            }
        }
        return count;
    }

    private static String removeWhitespaces(String str) {
        return str.replaceAll("\\s", "");
    }

    private static String longestWord(String str) {
        String[] words = str.split(" ");
        String longest = "";
        for (String word : words) {
            if (longest.length() < word.length()) {
                longest = word;
            }
        }
        return longest;
        //but what if there are two equal length words??
    }

    private static boolean isPalindrome(String str) {
        String reverse = reverseString(str);
        return str.equals(reverse);
    }

    private static String reverseString(String str) {
        if(str == null){
            return null;
        }
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }

    private static void iterateString(String str) {
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.print(ch + " ");
        }

    }

    private static int countChar(String str) {
        if(str == null){
            return 0;
        }
        return str.length();
    }
}
