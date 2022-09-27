public class NestedLoops {
    public static void main(String[] args) {
        /*class InnerNestedLoops {
            This will run 9 times. 
            The first pass is going to run the inner loop 3 times
            The second pass is going to run the inner loop 3 times
            The third pass is going to run the inner loop 3 times
        } */
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Hi!"); 
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("run: " + i);

            for(int j = 0; j < 3; j++) {
                System.out.println(j);
            }
        }

    }
    
}
