import java.util.Scanner;

/**
 * This program takes input in the form of a series of words and tests them for palindromes. Part of Lab 4.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 2/27/25
 */

public class ReverseWord{
    public static void main (String[] args){
        String word, remaining, combined, flipped;
        char firstLetter;
        Scanner keyboard = new Scanner (System.in);

        do{
            System.out.print("Enter a series of multiple words ending with the word quit to test for palindromes: ");
            word = keyboard.next().toLowerCase();
            while (!(word.equals("quit"))){
                firstLetter = word.charAt(0);
                remaining = word.substring(1);
                combined = remaining + firstLetter;
                flipped = "";
                for(int i=combined.length()-1; i>=0; i--){
                    flipped += combined.charAt(i);
                } 
                if (word.equals(flipped)){
                    System.out.println(word + " is a palindrome.");
                }
                else{
                    System.out.println(word + " is not a palindrome.");
                }
                word = keyboard.next().toLowerCase();
            }
         System.out.print("Type yes if you would like to enter another line? ");   
        }while(keyboard.next().equalsIgnoreCase("yes"));
    }
}
