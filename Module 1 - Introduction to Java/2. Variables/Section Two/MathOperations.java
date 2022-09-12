public class MathOperations {

    public static void main(String[] args) {
        int bagOfSweets1 = 5; //George
        int bagOfSweets2 = 10; //Fred

        long starsInMilkyWays = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScore = 6.7;
        double bonusPoints = 2.5;

        System.out.println("Addition");
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets.");
        System.out.println("There are " + (starsInMilkyWays + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Charles scored " + (testScore + bonusPoints) + "/10 on his math test. Carlos wasn't too thrilled.");
        System.out.println("\n");


        System.out.println("Subtraction");
        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George.");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWays) + " more stars in the Milky Way.");
        System.out.println("Sam ended up removing marks. Charles actually scored " + (testScore - bonusPoints) + "/10 on his math test.");
        System.out.println("\n");
        

        System.out.println("Multiplication");
        System.out.println("Fred and George used a special reciepe to multiply the taste of their sweets to: " + (bagOfSweets2 * bagOfSweets1));
        System.out.println("Sam made an error on his excel, accidentally multiplying Charles' score to: " + (testScore * bonusPoints) + "/10.");
        System.out.println("\n");

        System.out.println("Divsion");
        System.out.println("Originally, Fred had " + (bagOfSweets2 / bagOfSweets1) + " times more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda / starsInMilkyWays) + " times more stars.");
        System.out.println("Sam caught the error. Furious, he divided Charles' score to: " + (testScore / bonusPoints));
        System.out.println("\n");

        System.out.println("Module");
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));
        System.out.println("\n");


        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("I count: " + counter);

        counter--;
        counter--;
        counter--;
        System.out.println("I count: " + counter);

        counter+=5;
        counter+=6;
        counter=-4;
        System.out.println("I count: " + counter);

        counter+=5;
        counter+=6;
        counter-=4;
        System.out.println("I count: " + counter);


    

    }
    
}


// 10 is an even number, since dividing 10 by 2 has a remainder of: <remainder>

// 5 is an odd number, since dividing 5 by 2 has a remainder of: <remainder>