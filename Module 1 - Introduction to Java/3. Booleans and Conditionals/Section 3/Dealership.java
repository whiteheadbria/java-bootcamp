import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership");

        System.out.println("First, what is your name?");
        String name = scan.nextLine();

        System.out.println("\nOkay, " + name + " let's look at some options to get started");
        System.out.println("Select Option 'A' to buy a car");        
        System.out.println("Select Option 'B' to sell a car");
        String option = scan.nextLine();

        switch(option) {
            case "A": 
            case "a": {
                System.out.println("\nYou chose option " + option + ". So you want to buy a car, " + name); break;
            }

            case "B":
            case "b": {
                System.out.println("\nYou chose option " + option + ". So you want to see a car, " + name); break;
            }

            default: System.out.println("\nPlease enter a valid option of 'A' or 'B'");
        }


        

        System.out.println("\n" + name + ", what is your budget?");
        double budget = scan.nextDouble();


        System.out.println("Great, " + name + ". A + <car brand and name> + is available for $" + budget);

        scan.nextLine();
        System.out.println("Do you have insurance? 'Yes' or 'No'");
        String insurance = scan.nextLine();

        switch(insurance) {
            case "Yes":
            case "YES": 
            case "yes": {
            System.out.println("\nGreat " + name + " you are insured!"); break;
            }

            case "No": 
            case "NO": 
            case "no": {
                System.out.println("\nSo you may also need to look into insurance it seems, " + name); break;
            }

            default: System.out.println("\nPlease enter a valid response of 'Yes' or 'No'");
        }



        System.out.println("Do you have a license? Please type 'Yes' or 'No'");
        String license = scan.nextLine();

        switch(license) {
            case "Yes":
            case "YES":
            case "yes": {

            System.out.println("\nGreat " + name + " you have a license!"); break;
            }
            
            case "No":
            case "NO":
            case "no": {
                System.out.println("\nSo it seems you aren't legally able to drive, " + name); break;
            }

            default: System.out.println("\nPlease enter a valid response of 'Yes' or 'No' to if you have a license or not");
        }

      //  scan.nextLine(); //? can remove? YES. if i left it there it would make me have to hit enter twice

      //fix credit score. not correct ranges in the 670 ranges. so the good credit 
        System.out.println("What is your credit score?");
        int creditScore = scan.nextInt(); //credit scores are between 300 - 850 
        
        if(creditScore >= 800 && creditScore <= 850) {
            System.out.println(name + ", you have an Excellent credit score. The car is sold! It was a pleasure doing business with you");
        }

        else if(creditScore >= 799 && creditScore <= 741) {
            System.out.println(name + ", you have a Very Good credit score. The car is sold! It was a pleasure doing business with you");
        }

        else if(creditScore >= 740 && creditScore <= 670) {
            System.out.println(name + ", you have a  Good credit score. The car is sold! It was a pleasure doing business with you");
        }

        else if(creditScore >= 580 && creditScore <= 669) {
            System.out.println(name + ", you have a Poor credit score. I cannot sell you a car");
        }

        else if(creditScore >= 300 && creditScore <= 579) {
            System.out.println(name + ", you have a Poor credit score. I cannot sell you a car");
        }

        else {
            System.out.println("Invalid credit score. Credit scores are in the range of 300 - 850");
        }

        // else if (creditScore > 851 || creditScore< 299 ) {
        //     System.out.println("Invalid credit score. Credit scores are in the range of 300 - 850");
        // }

        


     //   System.out.println("Sold! Pleasure doing business with you?");

       // System.out.println("Sadly! Your credit score does not allow me to sell you a car.");

        scan.close();



    }
    
}
