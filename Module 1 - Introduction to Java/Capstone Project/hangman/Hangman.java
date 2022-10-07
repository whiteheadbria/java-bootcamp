/* Module 1: Capstone Project

     * Your game must chose a random word from this list of words: randomWord function
     * The placeholder '_' in your game must reflect the number of characters in that word
     * 
     * At every turn you must show the gallows, reflecting the number of missed guesses
     * 
     * Keep track of every incorrect guess the user nmade. This helps the user avoid the same mistake twice
     * 
     * Replace placeholders with correct guesses
     * 
     * If user wins, stop the game. (break) and output: GOOD WORK!
     * If user loses, stop the game. (break) and output: You loss. The word was: 
*/

import java.util.Arrays;
import java.util.Scanner;
public class Hangman {

public static Scanner scan = new Scanner(System.in);

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    
    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n", //zero missed guesses

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n", //one missed guess

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n", //two missed guesses

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n", //three missed guesses

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "     |\n" +
    "     |\n" +
    " =========\n", //four missed guesses

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n", //five missed guesses

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"}; //six missed guesses

    public static void main(String[] args) {
        String word = randomWord();
       // System.out.println("\n" + word + "\n"); // used to check if word was working correctly

        char[] placeholders = new char[word.length()];
        for (int i = 0; i < placeholders.length; i++) {
            placeholders[i] = '_';
        }

        System.out.print("Word: " + "\t");
        System.out.println(placeholders);
        
        System.out.println("\nMisses: ");
        int misses = 0; 

        char[] incorrectGuesses = new char [6];

        while(misses < 6) {
            System.out.print(gallows[misses]);

            System.out.print("Word: ");
            printPlaceholders(placeholders);
            System.out.print("\n");
            
            System.out.print("Incorrect: ");
            printMissedGuesses(incorrectGuesses);
            System.out.print("\n \n");

            System.out.print("Guess: ");
            char guess = scan.next().charAt(0); //no next.Char
            System.out.print("\n"); 

            if(checkGuesses(word, guess)) {
                updatePlacesholders(word, placeholders, guess); 
            }
                else {
                    incorrectGuesses[misses] = guess;
                    misses++;
                }
            
                // Won the game
            if(Arrays.equals(placeholders, word.toCharArray())) {
                System.out.print(gallows[misses]);
                System.out.print("\nWord: ");

                printPlaceholders(placeholders);
                System.out.println("Good Work!");
                break; 
            }
                } // end of while loop

                // Lost the game
            if(misses == 6) {
                System.out.print(gallows[6]);
                System.out.println("\nSorry, the word was: " + word);
            }
            scan.close();
        }
    
//Functions: 

    /** Returns a random word from the list of random words
     * Function name - randomWords() 
     * @param numberWords (String)
     * @return words (String)
     * 
     *  1. using Math.random to get a random word based on index location
     */

     public static String randomWord() {
        int numberWords = words.length; 
        double randomDouble = Math.random(); 
        int randomIndex = (int)(randomDouble * numberWords); 

        return words[randomIndex]; 
     }


      /** Prints the placeholders; reflect the number of characters in that word
     * Function name - printPlaceholders() 
     * @param placeholder (char[])
     * 
     *   1. For loop for iteration to read over the length of word
     *   2. Print number of " " based on length of word, that will place the '_' with spaces
     */

     public static void printPlaceholders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            System.out.print(" " + placeholders[i]);
        }
        System.out.print("\n");
     }


      /** Returns true if the user guesses a letter from the word correctly
     * Function name - checkGuesses() 
     * @param  word (String)
     * @param guess (char)
     * @return (boolean)
     * 
     *   1. for loop to read the random word that was pulled
     *   2. looking at the characters entered, looping through
     *   3. boolean returns true if the guessed character is correct
     */
     public static boolean checkGuesses(String word, char guess) {
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == guess) {
                return true;
            }
        }
        return false;
     }


      /** Updates the placeholder when the user makes a correct guess with the correct characters
     * Function name - updatePlacesholders() 
     * @param word (String)
     * @param replacePlaceholders (char[])
     * @param guess (char)
     * 
     *   1. for loop to read the random word that was pulled
     *   2. looking at the characters entered, looping through
     *   3. a correct character will replce the placeholder '_'
     */
     public static void updatePlacesholders(String word, char[] placeholders, char guess) {
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == guess) {
                placeholders[i] = guess;
            }
        }
     }


     /** Prints the guesses that the user missed
     * Function name - printMissedGuesses() 
     * @param incorrectGuesses (char[])
     * 
     *   1. read through length of incorrect guesses
     *   2. print out missed guesses
     */

     public static void printMissedGuesses(char[] incorrectGuesses) {
        for(int i = 0; i < incorrectGuesses.length; i++) {
            System.out.print(incorrectGuesses[i]);
        }
     }
}