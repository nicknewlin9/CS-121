/*
 *******************************************************************
 * Activity 23
 * Name: Nicholas Newlin
 * Date of Submission (10/31/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 * The best time complexity would be O(1) because it would only run
 * once if the string length is 0 or 1
 *
 * The worst time complexity would be 0(n/2) because it would only
 * have to go through half of the string to see if it is a palindrome
 *
 * The average time complexity would be O(n/2) for the same reason
 *******************************************************************
 */
public class PalindromeDetector
{
    public static void main(String args[])
    {
        String word1 = "squidward";
        String word2 = "mom";

        System.out.printf("Is the word \"%s\" a palindrome? " + isPalindrome(word1),word1);
        System.out.println();
        System.out.printf("Is the word \"%s\" a palindrome? " + isPalindrome(word2),word2);
    }

    static boolean isPalindrome(String string)
    {
        if (string.length() == 1 || string.length() == 0)
        {
            return true;
        }
        else if (string.charAt(0) == string.charAt(string.length()-1))
        {
            return isPalindrome(string.substring(1, string.length()-1));
        }
        else
            return false;
    }
}
