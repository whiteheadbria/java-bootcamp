import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */

         System.out.println("How many pizza toppings do you want?");
         int numberToppings = scan.nextInt();
         scan.nextLine();

        // Task 2 – Create the array here
         String[] toppings = new String[numberToppings];

        
        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         */

         System.out.println("Great, enter each topping!");
         for(int i = 0; i < toppings.length; i++) {
            System.out.print(i + ". ");
            toppings[i] = scan.nextLine();
         }

        

        /** Task 5 –  Loop through the length of the array and print each topping */

         System.out.println("\nThank you! Here are the toppings you ordered");
         for(int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". " + toppings[i]);
         }


        /** Task 6 –  Confirm the order */

         System.out.println("Press any key to comfirm order");
         scan.nextLine();
         System.out.println("Order confirmed. Delivery on the way!");

        scan.close();


         
    }
}
