public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if (wallet > toyCar) {
            System.out.println("Sure!");
            
            wallet = (wallet - toyCar);
        }

        else {
            System.out.println("Sorry, I have $" + wallet + " left");
        }

        
        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");

        if (wallet > nike) {
            System.out.println("Sure!");
            
            wallet = (wallet - nike);
            System.out.println(wallet);
        }

        else {
            System.out.println("Sorry, I have $" + wallet + " left");
        }

    }
}