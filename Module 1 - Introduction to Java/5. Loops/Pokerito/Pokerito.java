import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Press anything when you're ready.");
        scan.nextLine();

        System.out.println("It's like Power but a lot simpler.\n");

        System.out.println("- There are two players, you and the computer.");
        System.out.println("- The dealer will give each players one card.");
        System.out.println("- Then, the dealer will draw five cards (the river)");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone wins!\n");

        System.out.println("Ready? Press anything if you are!");
        scan.nextLine();
        

        String yourCard = randomCard();
        String computerCard = randomCard();

        System.out.println("Here is your card: \n" + yourCard);
        System.out.println("Here is the computer's card: \n" + computerCard);


        int yourMatches = 0;
        int computerMatches = 0;

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */

         System.out.print("Now, the dealer will draw five cards. Press enter to continue until five cards are drawn.");
         for (int i = 1; i <= 5; i++) {
            scan.nextLine();
            String draw = randomCard();
            
            if(yourCard.equals(draw)) {
                yourMatches++;
            }

            if(computerCard.equals(draw)) {
                computerMatches++;
            }

            System.out.println("Card " + i + "\n");
            System.out.println(draw);
    
         }
         

        /** Task 5 - Get the winner
         * 
         * • Count your number of matches..
         */

         System.out.println("Your number of matches: " + yourMatches);
         System.out.println("The computer number of matches: " + computerMatches);

         if(yourMatches > computerMatches) {
            System.out.println("You win!");
         }

         if (yourMatches < computerMatches) {
            System.out.println("The computer wins!");
            }

         if(yourMatches == computerMatches) {
            System.out.println("Everyone wins!");
         }
         

         scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */

     public static String randomCard() {
        double randomNumber = Math.random() * 13;
        randomNumber +=1;

        switch ((int)randomNumber) {
            case 1: 
            return 
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
        

            case 2:
            return   
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";

        case 3:
        return 
        "   _____\n" +
        "  |3    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____E|\n";

        case 4:
        return  
        "   _____\n" +
        "  |4    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  | o o |\n"+
        "  |____h|\n";

        case 5:
        return   
        "   _____ \n" +
        "  |5    |\n" +
        "  | o o |\n" +
        "  |  o  |\n" +
        "  | o o |\n" +
        "  |____S|\n";

        case 6:
        return      
        "   _____ \n" +
        "  |6    |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  |____6|\n";

        case 7:
        return  
        "   _____ \n" +
        "  |7    |\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |____7|\n";

        case 8: 
        return   
        "   _____ \n" +
        "  |8    |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  |____8|\n";

        case 9:
        return   
        "   _____ \n" +
        "  |9    |\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |____9|\n";

        case 10:
        return     
        "   _____ \n" +
        "  |10  o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |___10|\n";

        case 11:
        return     
        "   _____\n" +
        "  |J  ww|\n"+ 
        "  | o {)|\n"+ 
        "  |o o% |\n"+ 
        "  | | % |\n"+ 
        "  |__%%[|\n";

        case 12:
        return  
        "   _____\n" +
        "  |Q  ww|\n"+ 
        "  | o {(|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%O|\n";

        case 13: 
        return 
        "   _____\n" +
        "  |K  WW|\n"+ 
        "  | o {)|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%>|\n";


        default:
        return "This shouldnt be called";
        

     }

}
}