/*Additional Problems (on Strings):

A) Write a Java program to count the total number of words in a sentence.
B) Write a Java program to reverse the positions of all the words in a sentence.
C) Write a Java program to find all palindromic words in a multiword string.
D) Write a Java program to remove all duplicate words from a sentence.
E) Write a Java program to remove all duplicate characters from a string.
F) Write a Java program to count all the consonants, vowels, digits, or special symbols in a string.
G) Write a Java program to find the longest word in a sentence. 
H) Write a Java program to count and print the frequency of each character in a string. 
I) Write a Java program to sort a string array alphabetically in ascending order (like dictionary) using any suitable sorting technique. 
J) Write a Java program to count the occurrence of a substring in another string.
K) Write a Java program to convert a sentence into title case.
L) Write a Java program to reverse the words of a sentence at their places.
 */


package JAVA.Lab_5;

import java.util.*;

public class Q24_Additional {

    // A) Count words in a sentence
    static int countWords(String s) {
        String[] words = s.trim().split("\\s+");
        return words.length;
    }

    // B) Reverse positions of words
    static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    // C) Find palindromic words
    static void palindromicWords(String s) {
        String[] words = s.split("\\s+");
        System.out.print("Palindromes: ");
        for (String w : words) {
            if (w.equalsIgnoreCase(new StringBuilder(w).reverse().toString())) {
                System.out.print(w + " ");
            }
        }
        System.out.println();
    }

    // D) Remove duplicate words
    static String removeDuplicateWords(String s) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(s.split("\\s+")));
        return String.join(" ", set);
    }

    // E) Remove duplicate characters
    static String removeDuplicateChars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) sb.append(c);
        }
        return sb.toString();
    }

    // F) Count vowels, consonants, digits, special symbols
    static void countVowelsConsonantsDigitsSymbols(String s) {
        int vowels = 0, consonants = 0, digits = 0, symbols = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) digits++;
            else if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) >= 0) vowels++;
                else consonants++;
            } else symbols++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants +
                           ", Digits: " + digits + ", Symbols: " + symbols);
    }

    // G) Longest word in sentence
    static String longestWord(String s) {
        String[] words = s.split("\\s+");
        String longest = "";
        for (String w : words) if (w.length() > longest.length()) longest = w;
        return longest;
    }

    // H) Frequency of each character
    static void charFrequency(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        System.out.println("Character Frequency: " + map);
    }

    // I) Sort string array alphabetically
    static void sortStringArray(String[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // J) Count occurrence of substring
    static int substringCount(String s, String sub) {
        int count = 0, index = 0;
        while ((index = s.indexOf(sub, index)) != -1) { count++; index += sub.length(); }
        return count;
    }

    // K) Convert sentence to title case
    static String toTitleCase(String s) {
        String[] words = s.toLowerCase().split("\\s+");
        for (int i = 0; i < words.length; i++)
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        return String.join(" ", words);
    }

    // L) Reverse words in place
    static String reverseWordsInPlace(String s) {
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++)
            words[i] = new StringBuilder(words[i]).reverse().toString();
        return String.join(" ", words);
    }

    // Main method to test all
    public static void main(String[] args) {
        String sentence = "madam Arora teaches malayalam 123 !";

        System.out.println("Original: " + sentence);
        System.out.println("A) Word count: " + countWords(sentence));
        System.out.println("B) Reverse words: " + reverseWords(sentence));
        palindromicWords(sentence);
        System.out.println("D) Remove duplicate words: " + removeDuplicateWords(sentence));
        System.out.println("E) Remove duplicate chars: " + removeDuplicateChars(sentence));
        countVowelsConsonantsDigitsSymbols(sentence);
        System.out.println("G) Longest word: " + longestWord(sentence));
        charFrequency(sentence);
        String[] arr = {"banana", "apple", "orange"};
        sortStringArray(arr);
        System.out.println("J) Count 'a': " + substringCount(sentence, "a"));
        System.out.println("K) Title Case: " + toTitleCase(sentence));
        System.out.println("L) Reverse words in place: " + reverseWordsInPlace(sentence));
    }
}