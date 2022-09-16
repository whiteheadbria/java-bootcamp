import java.util.Scanner;
public class DiceJack {
    public static void main(String[] args) {

        int rollOne = rollTheDice();
        int rollTwo = rollTheDice();
        int rollThree = rollTheDice();

        System.out.println(rollOne);
        System.out.println(rollTwo);
        System.out.println(rollThree);


       Scanner scan = new Scanner(System.in);

       System.out.println("Please enter your three numbers between 1 - 6: ");
       int pickOne = scan.nextInt();
       int pickTwo = scan.nextInt();
       int pickThree = scan.nextInt();
    
       if (pickOne < 1 || pickTwo < 1 || pickThree < 1) {
        System.out.println("Numbers cannot be less than 1. Game is shutting down");
        System.exit(0);
       }

       if (pickOne > 6 || pickTwo > 6 || pickThree > 6) {
        System.out.println("Numbers cannot be greater than 6. Game is shutting down");
        System.exit(0);
       }

       int rollSum = (rollOne + rollTwo + rollThree);
       int pickSum = (pickOne + pickTwo + pickThree);

       System.out.println("\nThe numbersthe dice rolled are: " + rollOne + " " + rollTwo + " " + rollThree);
       System.out.println("The sum of the rolled dice are: " + rollSum + "\n");
       

       System.out.println("The numbers you entered are: " + pickOne + " " + pickTwo + " " + pickThree);
       System.out.println("The sum of your picks are: " + pickSum);

       if (checkOutcome(rollSum, pickSum)) {
        System.out.println("You won!");
       }

       else {
        System.out.println("Sorry, you lost");
       }

        scan.close();
    }
       /**
     * Rules of Dice Jack: 
     * The user needs to pick three numbers        calculate sum
     * The user needs to roll the dice three time  calculate sum
     * 
     * The user wins if:
     * The sum of the dice rolls is smaller than the sum of the numbers you chooose (bool)
     * AND the difference between the two numbers is less than three (bool)
     * 
     * 
     * Task 
     *  1. Roll the dice
     *  2. Check if the user won
     */

    /**
     * Function name: rollTheDice (need random)
     * 
     * Math.random() returns a number between 0 and less than 1. It should not roll 0.
     * Dice is between 1 - 6
     * @return randomNumber      (int)
     * 
     * Inside the function:
     *  1. Roll the dice three times
     *  2. Calculate the sum of the three rolls
     */

     public static int rollTheDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1; //shift range by one to be 1 - 6
        return (int)randomNumber;
     }


     /**
     * Function name: checkOutcome
     * @param rollSum (int)
     * @param pickSum (int) 
     * @return       (boolean)
     * 
     * Inside the function:
     *  1.The sum of the dice rolls is smaller than the sum of the numbers you chooose (bool)
     *    AND the difference between the two numbers is less than three (bool)
     * 
     * If both outcomes are true, then the user wins, else false 
     */

     public static boolean checkOutcome(int rollSum, int pickSum) {
        return (pickSum > rollSum && ((rollSum - pickSum) < 3));
}

}