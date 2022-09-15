import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which track did Lewis Hamilton come back from essentially a 25 place grid penalty?");
        System.out.println("\ta) COTA\n\tb) Italy\n\tc) Singapore\n\td) Brazil\n"); 
        String answerOne = scan.nextLine();
  
        System.out.println("\n2. What track did 23XI Racing get their first win as an organization?");
        System.out.println("\ta) Talladega\n\tb) Kansas\n\tc) Daytona\n\td) Miami\n");
        String answerTwo = scan.nextLine(); 

        System.out.println("\n3. What year did Lewis Hamilton win his 7th world championship?");
        System.out.println("\ta) 2015\n\tb) 2018\n\tc) 2020\n\td) 2019\n"); 
        String answerThree = scan.nextLine();
    
        System.out.println("\n4. What number does Lewis Hamilton drive in Formula 1?");
        System.out.println("\ta) 43\n\tb) 44\n\tc) 11\n\td) 45\n"); 
        String answerFour = scan.nextLine();
    
      
        System.out.println("\n5. What track did the number 45 sweep in 2022?");
        System.out.println("\ta) Kansas\n\tb) Daytona\n\tc) Miami\n\td) Los Angeles\n");
        String answerFive = scan.nextLine();
       
        System.out.println("\n6. Which driver(s) are tied for seven World Championships in Formula 1? Hint: There are two correct answers");
        System.out.println("\ta) Lewis Hamilton\n\tb) George Russell\n\tc) Michael Schumacher\n\td) Sebastian Vettel\n"); 
        String answerSix = scan.nextLine();

        int score = 0;
        
      
        if(answerOne.equals("d") || (answerOne.equals("D"))) {
            score += 5;
        }

        if(answerTwo.equals("a") || (answerTwo.equals("A"))) {
            score += 5;
        }

        if(answerThree.equals("c") || (answerThree.equals("C"))) {
            score += 5;
        }

        if(answerFour.equals("b") || (answerFour.equals("B"))) {
            score += 5;
        }

        if(answerFive.equals("a") || (answerFive.equals("A"))) {
            score += 5;
        }

        if(answerSix.equals("a c") || (answerSix.equals("A C"))) {
            score += 5;
        }

        
        System.out.println("Your final score is: " + score + "/30");


        if(score >= 25) {
            System.out.println("Wow, you know your stuff!");
        }

        else if(score >= 24 && score < 20) {
            System.out.println("Not too bad!");
        }

        else {
            System.out.println("Research some more and try again");
        }

        scan.close();

    }
}