import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("1. Which track did Lewis Hamilton come back from essentially a 25 place grid penalty?");
        System.out.println("\ta) COTA\n\tb) Brazil\n\tc) Singapore\n\td) Italy\n");
        //score++;

        System.out.println("\n2. What track did 23XI Racing get their first win as an organization?");
        System.out.println("\ta) Talladega\n\tb) Kansas\n\tc) Daytona\n\td) Miami\n");
        //score++;

        System.out.println("\n3. What year did Lewis Hamilton win his 7th world championship?");
        System.out.println("\ta) 2020\n\tb) 2018\n\tc) 2015\n\td) 2019\n");
        //score++;

        System.out.println("\n4. What number does Lewis Hamilton drive in Formula 1?");
        System.out.println("\ta) 44\n\tb) 23\n\tc) 11\n\td) 45\n");
        //score++;

        System.out.println("\n5. What track did the number 45 sweep in 2022?");
        System.out.println("\ta) Kansas\n\tb) Daytona\n\tc) Miami\n\td) Los Angeles\n");
        //store answer 5
        //score++

        System.out.println("\n6. Which drivers are tied for seven World Championships in Formula 1?");
        System.out.println("\ta) Lewis Hamilton\n\tb) George Russell\n\tc) Michael Schumacher\n\td) Sebastian Vettel\n");
        //store answer 6
        //score++
        
        

        //Task 2: Check each answer - For each correct answer, add 5 points to the score. (if-else) 
        
        System.out.println("Your final score is: " + score + "/30");

        //Task 3: print a message depending on the score

        // if the score is 15 or higher, print: "Wow, you know your motorsports!";
        // if the score is between 5 and 15, print "Not bad!";
        // Go rewatch some races and try again. 


        scan.close();

    }
}