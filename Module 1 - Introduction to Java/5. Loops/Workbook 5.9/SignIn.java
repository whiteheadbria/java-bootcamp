import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Bria";
        String password = "Java <3";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");

        System.out.print("• Username: ");
        String inputUsername = scan.nextLine();

        System.out.print("• Password: ");
        String inputPassword = scan.nextLine();

        /* Task 2 
            1. Set up a loop that keeps running while the username OR password is incorrect. 
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print: 
                   \nSign in successful. Welcome!
       */

       while (!inputUsername.equals(username) || !inputPassword.equals(password)) {
        System.out.println("\nIncorrect, please try again\n");
        System.out.print("• Username: ");
        inputUsername = scan.nextLine();

        System.out.print("• Password: ");
        inputPassword = scan.nextLine();
       }

       System.out.println("Sign in successful. Welcome!");

        scan.close();

        
    }
}
