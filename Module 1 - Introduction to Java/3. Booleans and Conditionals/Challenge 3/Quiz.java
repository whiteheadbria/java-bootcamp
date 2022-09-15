import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("1. Which track did Lewis Hamilton come back from essentially a 25 place grid penalty?");
        System.out.println("\ta) COTA\n\tb) Italy\n\tc) Singapore\n\td) Brazil\n"); 
        String questOne = scan.next();
        //store answer 2

        System.out.println("\n2. What track did 23XI Racing get their first win as an organization?");
        System.out.println("\ta) Talladega\n\tb) Kansas\n\tc) Daytona\n\td) Miami\n");
        String questTwo = scan.next(); 
        //store answer 2
       

        System.out.println("\n3. What year did Lewis Hamilton win his 7th world championship?");
        System.out.println("\ta) 2015\n\tb) 2018\n\tc) 2020\n\td) 2019\n"); 
        String questThree = scan.next();
        //store answer 3
    

        System.out.println("\n4. What number does Lewis Hamilton drive in Formula 1?");
        System.out.println("\ta) 43\n\tb) 44\n\tc) 11\n\td) 45\n"); 
        String questFour = scan.next();
        //store answer 4
      
        System.out.println("\n5. What track did the number 45 sweep in 2022?");
        System.out.println("\ta) Kansas\n\tb) Daytona\n\tc) Miami\n\td) Los Angeles\n");
        String questFive = scan.next();
        //store answer 5
       

        System.out.println("\n6. Which driver(s) are tied for seven World Championships in Formula 1? Hint: There are two correct answers");
        System.out.println("\ta) Lewis Hamilton\n\tb) George Russell\n\tc) Michael Schumacher\n\td) Sebastian Vettel\n"); 
        String questSix = scan.nextLine();
        //store answer 6
        
        
        

        //Task 2: Check each answer - For each correct answer, add 5 points to the score. (if-else) 
        
        
        System.out.println("Your final score is: " + score + "/30");

        //Task 3: print a message depending on the score

        if(score >= 15) {
            System.out.println("Wow, you know your stuff!");
        }

        else if(score >= 5 && score < 15) {
            System.out.println("Not too bad!");
        }

        else {
            System.out.println("Research some more and try again");
        }

        // if the score is 15 or higher, print: "Wow, you know your motorsports!";
        // if the score is between 5 and 15, print "Not bad!";
        // Go rewatch some races and try again. 


        scan.close();

    }
}