package org.launchcode;

import java.util.Scanner;
public class SearchWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wonderland = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations " +
                "in it, ‘and what is the use of a book,’ thought Alice ‘without " +
                "pictures or conversation?’";
        System.out.println("Enter a search term:");
        String userInput = input.nextLine();
        System.out.println(wonderland.contains(userInput.toLowerCase()));
        int index = wonderland.indexOf(userInput.toLowerCase());
        System.out.println("The word is at index " + index);
        int length = userInput.length();
        System.out.println("The word is " + length + " characters");
        String edit = wonderland.substring(0,index).concat(wonderland.substring(index+length, wonderland.length()-1));
        System.out.println(edit);
    }
}
