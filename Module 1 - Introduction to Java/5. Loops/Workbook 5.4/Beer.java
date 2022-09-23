public class Beer {
    public static void main(String[] args) {
       // Task 2: make a for loop that starts at i = 99, and finishes at i=1.
       for(int i = 99; i >= 1; i--) {
         sing(i);
       }
    }

    public static void sing(int i) {
         System.out.println(i  + " bottles of been on the wall, " + i + " bottles of beer!\n take on down, pass it around, " + (i -1) + " beer on the wall");
    }
}
