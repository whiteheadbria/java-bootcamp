import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int guess = scan.nextInt();

       while (guess != 4) {
        System.out.print("Guess again: ");
        guess = scan.nextInt();

       }

       System.out.print("You got it!");
      
        scan.close();
    }

}
