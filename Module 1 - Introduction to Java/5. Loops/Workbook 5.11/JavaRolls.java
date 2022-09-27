import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Let's play Rolling Java. Press anything to begin");
        scan.nextLine();

        /* Task 2: 
              1. Once the user is ready, print: 
                    Great, here are the rules:\n
                     - If you roll a 6 the game stops.
                     - If you roll a 4 nothing happens.
                     - Otherwise, you get 1 point.\n
                    You must collect at least 3 points to win. Enter anything to roll:
              2. Get the user to enter any value
        */

        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6 the game stops");
        System.out.println("- If you roll a 4 you get 0 points");
        System.out.println("- Otherwise, you get 1 point\n");
        System.out.println("You must collect at least 3 points to win. Press anything to roll the dice");        

       int score = 0;

       while(true) {
        scan.nextLine();
        int diceRoll = rollDice();
        System.out.println("You rolled a " + diceRoll + ". ");

        if (diceRoll == 6) {
          System.out.println("End of game");
          break;
        }

          else if (diceRoll == 4) {
            System.out.println("Zero points. Keep rolling");
            continue;
          }

          else {
            score++;
            System.out.println("One point. Keep rolling");
            continue;
          }
        }

        System.out.println("\nYour score is: " + score);

        if(score >= 3) {
          System.out.println("Wow, you won!");
        }

        else {
          System.out.println("You lose. Hopefully things roll around better next time.");
        }
        
       }
 
    /** Task 4
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */ 

     public static int rollDice() {
      double randomNumber = Math.random() * 6;
      randomNumber = randomNumber + 1;

      return (int)randomNumber;
     }
  
    }
