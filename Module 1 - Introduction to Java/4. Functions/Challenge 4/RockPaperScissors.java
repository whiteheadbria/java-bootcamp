import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
 
        String play = scan.nextLine();


    if(play.equals("yes") || play.equals("YES") || play.equals("Yes")) 
    {
        System.out.println("\nGreat!");
        System.out.println("rock - paper - scissors, shoot!"); 
        String choice = scan.nextLine();
        String computerChoice = computerChoice();

        String result = result(choice, computerChoice);
        printResult(choice, computerChoice, result);
    }
              
    else {
        System.out.println("Darn, some other time I  guess!");
        System.exit(0);
    }

        scan.close();
    }
    

     public static String computerChoice() {
        double randomNumber = Math.random() * 3; // range: 0 - 2.9999
        int integer = (int)randomNumber; // range: 0 -2

        switch (integer) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return ""; // not possible
        }
        
     }


    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = " ";

        if(yourChoice.equals("rock")|| yourChoice.equals("ROCK") && computerChoice.equals("scissors")) {
        result = "You win!";
        }

            else if(yourChoice.equals("paper")|| yourChoice.equals("PAPER") && computerChoice.equals("rock")) {
            result = "You win!";
        }

            else if(yourChoice.equals("scissors")|| yourChoice.equals("SCISSORS") && computerChoice.equals("paper")) {
            result = "You win!";
        }

            else if(yourChoice.equals("paper")|| yourChoice.equals("PAPER") && computerChoice.equals("rock")) {
            result = "You win!";
        }
            else if(computerChoice.equals("rock") && (yourChoice.equals("scissors")|| yourChoice.equals("SCISSORS"))) {
            result = "You lose";
        }

            else if(computerChoice.equals("paper") && (yourChoice.equals("rock")|| yourChoice.equals("ROCK"))) {
            result = "You lose";
        }

            else if(computerChoice.equals("scissors") && (yourChoice.equals("paper")|| yourChoice.equals("PAPER"))) {
            result = "You lose";
        }
            else {
                result = "It's a tie";
            }

       return result;
      }
 

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     */

     public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou choose:\t" + yourChoice);
        System.out.println("\nThe computer chose:\t" + computerChoice);
        System.out.println(result);

     }

}
