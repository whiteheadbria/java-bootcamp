public class EvenOrOdd {
    public static void main(String[] args) {
        // Task 1 – Make a for loop that counts from 0 to 19.
        for(int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        for(int j = 0; j < 20; j++) {

        if(j % 2 == 0) {
            System.out.println(j + ": even");
        }

        else {
            System.out.println(j + ": odd");
        }  

    }
}
}